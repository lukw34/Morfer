package uek.dev.pattern.matching.services;

import uek.dev.morfer.result.services.MorferService;
import uek.dev.morfer.result.services.MorferServiceImpl;

import java.util.ArrayList;

public class MorferPatternMatcher implements PatternMatcher {
    MorferService morferService = new MorferServiceImpl();

    @Override
    public boolean match(String entry, String pattern) {
        ArrayList<String> analizedEntry = morferService.getMorferResult(entry);
        ArrayList<String> analizedPattern = morferService.getMorferResult(entry);
        return  false;
    }

    @Override
    public boolean find(String entry, String pattern) {
        return false;
    }
}
