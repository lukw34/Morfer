package uek.dev.pattern.matching.services.tokenizer;


public class LinkingTokensGroup implements TokensGroup {
    private String patterns;

    public LinkingTokensGroup(String patterns) {
        System.out.println("Linking: " + patterns);
        this.patterns = patterns;
    }

}
