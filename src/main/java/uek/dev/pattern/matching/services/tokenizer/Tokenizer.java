package uek.dev.pattern.matching.services.tokenizer;

import uek.dev.pattern.matching.services.parser.Parser;

import java.util.Arrays;

public class Tokenizer {
    private String sourceCode;
    private Parser parser;

    public Tokenizer(String sourceCode, Parser parser) {
        this.sourceCode = sourceCode;
        this.parser = parser;
        makeTokensGroup();
    }

    private void makeTokensGroup() {
        String[] tokens = sourceCode.split("\\s+");
        Arrays.stream(tokens).forEach(parser::parse);
        parser.getTokensGroups();
    }
}
