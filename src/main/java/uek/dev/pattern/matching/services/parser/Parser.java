package uek.dev.pattern.matching.services.parser;

import uek.dev.pattern.matching.services.tokenizer.Pattern;
import uek.dev.pattern.matching.services.tokenizer.TokensGroup;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Parser {
    private SpecialSign previousSign;
    private ParserState actualParserState;
    private ArrayList<TokensGroup> tokensGroups;
    private ArrayDeque<String> tokensHeap;

    //States
    private ParserState exist;
    private ParserState linking;
    private ParserState order;

    public Parser() {
        this.previousSign = SpecialSign.EXIST;
        this.tokensHeap = new ArrayDeque<>();
        this.tokensGroups = new ArrayList<>();

        //init states
        exist = new ParserExist(this);
        linking = new ParserLinking(this);
        order = new ParserOrder(this);

        this.actualParserState = exist;
    }

    public void parse(String token) {
        SpecialSign actual = getSpecialSign(token);
        actualParserState.handleOperator(actual, this.previousSign);
        if (isNotOperator(actual)) {
            this.tokensHeap.add(token);
        }

        this.previousSign = actual;
    }

    void setExistState() {
        this.setState(this.exist);
    }

    void setLinkingState() {
        this.setState(this.linking);
    }

    void setOrderState() {
        this.setState(this.order);
    }

    private void setState(ParserState state) {
        TokensGroup tokensGroup = this.actualParserState.getTokenGroup(this.tokensHeap);
        if (tokensGroup != null) {
            this.tokensGroups.add(tokensGroup);
        }
        this.actualParserState = state;
    }

    public ArrayList<TokensGroup> getTokensGroups() {
        TokensGroup last = actualParserState.getLast(this.tokensHeap);
        this.tokensGroups.add(last);
        return tokensGroups;
    }


    private boolean isNotOperator(SpecialSign actual) {
        return actual == SpecialSign.EXIST;
    }


    private SpecialSign getSpecialSign(String token) {
        switch (token) {
            case "+":
                return SpecialSign.LINKING;
            case ">":
                return SpecialSign.ORDER;
            default:
                return SpecialSign.EXIST;
        }
    }

    ArrayList<Pattern> joinTokens() {
        ArrayList<Pattern> patterns = new ArrayList<>();
        this.tokensHeap.stream().map(Pattern::new).forEach(patterns::add);
        return patterns;
    }
}
