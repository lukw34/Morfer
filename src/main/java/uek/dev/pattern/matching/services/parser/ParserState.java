package uek.dev.pattern.matching.services.parser;

import uek.dev.pattern.matching.services.tokenizer.TokensGroup;

import java.util.ArrayDeque;

public interface ParserState {
    TokensGroup getTokenGroup(ArrayDeque<String> tokensHeap);

    TokensGroup getLast(ArrayDeque<String> tokensHeap);

    void handleOperator(SpecialSign actual, SpecialSign previous);
}
