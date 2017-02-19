package uek.dev.pattern.matching.services.parser;

import uek.dev.pattern.matching.services.tokenizer.OrderTokensGroup;
import uek.dev.pattern.matching.services.tokenizer.TokensGroup;

import java.util.ArrayDeque;

public class ParserOrder implements ParserState {
    private Parser parser;

    ParserOrder(Parser parser) {
        this.parser = parser;
    }

    @Override
    public TokensGroup getTokenGroup(ArrayDeque<String> tokensHeap) {
        String last = tokensHeap.getLast();
        TokensGroup tokensGroup = new OrderTokensGroup(parser.joinTokens());
        tokensHeap.clear();
        tokensHeap.add(last);
        return tokensGroup;
    }

    @Override
    public TokensGroup getLast(ArrayDeque<String> tokensHeap) {
        TokensGroup tokensGroup = getTokenGroup(tokensHeap);
        tokensHeap.clear();
        return tokensGroup;
    }

    @Override
    public void handleOperator(SpecialSign actual, SpecialSign previous) {

        switch (actual) {
            case EXIST:
                if (previous == SpecialSign.EXIST) {
                    parser.setExistState();
                }
                return;
            case LINKING:
                parser.setLinkingState();
        }
    }

}
