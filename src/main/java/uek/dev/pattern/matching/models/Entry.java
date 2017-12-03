package uek.dev.pattern.matching.models;

import org.hibernate.validator.constraints.NotBlank;

public class Entry {
    @NotBlank(message = "Entry should have [pattern] property")
    public String pattern;

    @NotBlank(message = "Entry should have [source] property")
    public String source;

    public Entry() {}

    public Entry(String pattern, String source) {
        this.pattern = pattern;
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
