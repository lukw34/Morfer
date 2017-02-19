package uek.dev.pattern.matching.services.tokenizer;


public class OrderTokensGroup implements TokensGroup {
    private String patterns;

    public OrderTokensGroup(String patterns) {
        System.out.println("Order: " + patterns);
        this.patterns = patterns;
    }

}
