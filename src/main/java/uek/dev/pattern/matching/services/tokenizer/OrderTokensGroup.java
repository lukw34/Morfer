package uek.dev.pattern.matching.services.tokenizer;


import java.util.ArrayList;

public class OrderTokensGroup implements TokensGroup {
    private ArrayList<Pattern> patterns;

    public OrderTokensGroup(ArrayList<Pattern> patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean check(ArrayList<String> entries) {
        int patternSize = patterns.size();
        int patternIndicator = 0;
        for (int index = 0; index < entries.size(); index++) {
            String entry = entries.get(index);
            Pattern actualPattern = patterns.get(patternIndicator);
            boolean isMatch;
            if(actualPattern.isNegate()) {
                isMatch = handleNegate(entries, actualPattern, index);
                if(!isMatch) {
                    return false;
                }
            } else {
                isMatch = actualPattern.check(entry);
            }
            if (isMatch) {
                patternIndicator += 1;
            }

            if(patternIndicator >= patternSize) {
                return true;
            }
        }
   
        return false;
    }

    private boolean handleNegate(ArrayList<String> entries, Pattern actualPattern, int startPoint) {
        for (int index = startPoint; index < entries.size(); index++) {
            boolean isMatch = actualPattern.check(entries.get(index));
            if(isMatch) {
                return false;
            }
        }

        return true;
    }


}
