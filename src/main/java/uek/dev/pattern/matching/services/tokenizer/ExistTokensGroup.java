package uek.dev.pattern.matching.services.tokenizer;

import java.util.ArrayList;

public class ExistTokensGroup implements TokensGroup {
    private ArrayList<Pattern> patterns;

    public ExistTokensGroup(ArrayList<Pattern> patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean process(ArrayList<String> entry) {
        for (Pattern pattern : patterns) {

            boolean isNoneMatch = entry.stream().noneMatch(pattern::match);
            boolean isMatch = pattern.isNegate() != isNoneMatch;
            if(isMatch) {
                return false;
            }
        }

        return true;
    }
}
