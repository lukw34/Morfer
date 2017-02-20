package uek.dev.pattern.matching.services.tokenizer;

import uek.dev.pattern.matching.services.parser.Parser;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer {
    private String sourceCode;
    private Parser parser;
    private ArrayList<TokensGroup> tokensGroups;

    public Tokenizer(String sourceCode, Parser parser) {
        this.sourceCode = sourceCode.trim();
        this.parser = parser;
        this.tokensGroups = new ArrayList<>();
        makeTokensGroup();
    }

    private void makeTokensGroup() {
        String[] tokens = sourceCode.split("\\s+");
        Arrays.stream(tokens).forEach(parser::parse);
        this.tokensGroups = parser.getTokensGroups();
    }

    public boolean process(ArrayList<String> entry) {
        boolean result = this.tokensGroups.stream()
                .map(tokensGroup -> tokensGroup.process(entry))
                .allMatch(val -> val);
        tokensGroups.clear();
        return result;
    }
}
