package uek.dev.pattern.matching.services.tokenizer;

import java.util.ArrayList;

public class ExistTokensGroup implements TokensGroup {
    private ArrayList<Pattern> patterns;

    public ExistTokensGroup(ArrayList<Pattern> patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean check(ArrayList<String> entry) {
        for (Pattern pattern : patterns) {

            boolean isMatch = entry.stream().noneMatch(pattern::check) != pattern.isNegate();
            if(isMatch) {
                return false;
            }
        }

        return true;
    }
}
