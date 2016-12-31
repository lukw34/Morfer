package uek.dev.pattern.matching.services;

public interface PatternMatcher {
    public boolean match(String entry, String pattern);
    public boolean find(String entry, String pattern);
}
