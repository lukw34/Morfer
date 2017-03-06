package uek.dev.pattern.matching.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uek.dev.morfer.result.models.json.Word;
import uek.dev.morfer.result.services.MorferService;
import uek.dev.morfer.result.services.MorferServiceImpl;
import uek.dev.pattern.matching.services.parser.Parser;
import uek.dev.pattern.matching.services.tokenizer.Tokenizer;

import java.util.ArrayList;

@Service("morferPatternMatcher")
@Transactional
public class MorferPatternMatcher implements PatternMatcher {
    MorferService morferService = new MorferServiceImpl();

    @Override
    public boolean match(String entry, String pattern) {
        ArrayList<Word> analyzedEntry = morferService.createModel(entry);
        ArrayList<String> simplifiedEntry = new ArrayList<>();
        Parser parser = new Parser();
        Tokenizer tokenizer = new Tokenizer(pattern, parser);
        analyzedEntry
                .forEach(val -> val.getTags()
                        .forEach(tag -> simplifiedEntry.add(tag.getLemma() + ":" + tag.getInterpretation())));

        //+ ten wyraz ma byc bezposrednio po nastepnym
        // > kolejnosc ale po drodze moze cos byc
        // ! nie ma wystapic
        //ala:subst + !ala:substs

        return tokenizer.process(simplifiedEntry);
    }

}
