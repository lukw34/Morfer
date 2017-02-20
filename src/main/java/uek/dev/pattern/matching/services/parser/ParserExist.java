package uek.dev.pattern.matching.services.parser;

import uek.dev.pattern.matching.services.tokenizer.ExistTokensGroup;
import uek.dev.pattern.matching.services.tokenizer.TokensGroup;

import java.util.ArrayDeque;

public class ParserExist implements ParserState {
    private Parser parser;

    ParserExist(Parser parser) {
        this.parser = parser;
    }

    @Override
    public TokensGroup getTokenGroup(ArrayDeque<String> tokensHeap) {
        String last = tokensHeap.removeLast();
        TokensGroup tokensGroup = null;

        if (tokensHeap.size() > 2) {
            tokensHeap.removeFirst();
        }

        if (tokensHeap.size() > 0) {
            tokensGroup = new ExistTokensGroup(parser.joinTokens());
        }
        tokensHeap.clear();
        tokensHeap.add(last);
        return tokensGroup;
    }

    @Override
    public TokensGroup getLast(ArrayDeque<String> tokensHeap) {
       /* if(tokensHeap.size() > 1) {
            tokensHeap.removeFirst();
        }
*/
        TokensGroup tokensGroup = new ExistTokensGroup(parser.joinTokens());
        tokensHeap.clear();
        return tokensGroup;
    }

    @Override
    public void handleOperator(SpecialSign actual, SpecialSign previous) {
        switch (actual) {
            case LINKING:
                parser.setLinkingState();
                return;
            case ORDER:
                parser.setOrderState();
        }
    }

}
