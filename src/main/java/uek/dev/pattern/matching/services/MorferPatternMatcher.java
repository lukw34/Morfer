package uek.dev.pattern.matching.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uek.dev.morfer.result.models.json.Word;
import uek.dev.morfer.result.services.MorferService;
import uek.dev.morfer.result.services.MorferServiceImpl;

import java.util.ArrayList;

@Service("morferPatternMatcher")
@Transactional
public class MorferPatternMatcher implements PatternMatcher {
    MorferService morferService = new MorferServiceImpl();

    @Override
    public boolean match(String entry, String pattern) {
        ArrayList<Word> analizedEntry = morferService.createModel(entry);
        int entrySize = analizedEntry.size();

        return true;
    }

    @Override
    public boolean find(String entry, String pattern) {
        return false;
    }
}
