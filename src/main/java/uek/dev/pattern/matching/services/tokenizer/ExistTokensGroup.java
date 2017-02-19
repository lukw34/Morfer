package uek.dev.pattern.matching.services.tokenizer;


public class ExistTokensGroup implements TokensGroup {
    private String patterns;

    public ExistTokensGroup(String patterns) {
        System.out.println("Exist: " + patterns);
        this.patterns = patterns;
    }

}
