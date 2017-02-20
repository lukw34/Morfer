package uek.dev.pattern.matching.services.tokenizer;

import java.util.Objects;

public class Pattern {
    private final String SEPARATOR = ":";
    private String pattern;
    private boolean negate;

    public Pattern(String pattern) {
        this.pattern = pattern;
        this.negate = this.pattern.substring(0, 1).equals("!");
        checkNegate();
    }

    private void checkNegate() {
        this.negate = this.pattern.substring(0, 1).equals("!");
        if(this.negate) {
            this.pattern = this.pattern.substring(1);
        }
    }

    boolean match(String entry) {
        String[] patternElements = pattern.split(SEPARATOR);
        String[] entryElements = entry.split(SEPARATOR);
        for (int i = 0; i < patternElements.length; i++) {
            String patternElement = patternElements[i];
            String entryElement = entryElements[i];
            boolean isEqual = entryElement.equals(patternElement);
            if (!isEqual) {
                return false;
            }
        }

        return true;
    }

    boolean isNegate() {
        return negate;
    }
}
