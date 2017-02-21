package uek.dev.pattern.matching.services.tokenizer;


import java.util.ArrayList;

public class LinkingTokensGroup implements TokensGroup {
    private ArrayList<Pattern> patterns;

    public LinkingTokensGroup(ArrayList<Pattern> patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean check(ArrayList<String> entry) {
        int patternSize = patterns.size();
        int startPoint = 0;
        int limit = entry.size() - patternSize;
        for (int index = startPoint; index < limit ; index++) {
            ArrayList<String> sample = getSample(entry, startPoint, patternSize);
            boolean isMatch = isPatternMatch(sample);
            if(isMatch) {
                return true;
            }

            startPoint += 1;
        }
        return false;
    }

    private boolean isPatternMatch(ArrayList<String> sample) {
        for (int i = 0; i < this.patterns.size(); i++) {
            Pattern pattern = patterns.get(i);
            boolean isMatch = pattern.check(sample.get(i));
            if(isMatch == pattern.isNegate()) {
                return false;
            }
        }

        return true;
    }

    private ArrayList<String> getSample(ArrayList<String> entry, int startPoint, int size) {
        ArrayList<String> sample = new ArrayList<>();
        int limit = size + startPoint;
        for (int i = startPoint; i < limit ; i++) {
            sample.add(entry.get(i));
        }

        return sample;
    }
}
