package uek.dev.pattern.matching.services;

import org.springframework.stereotype.Service;
import uek.dev.morfer.result.models.json.Segment;
import uek.dev.morfer.result.services.MorferService;
import uek.dev.morfer.result.services.MorferServiceImpl;
import uek.dev.pattern.matching.services.parser.Parser;
import uek.dev.pattern.matching.services.tokenizer.Tokenizer;

import java.util.ArrayList;

@Service("morferPatternMatcher")
public class MorferPatternMatcher implements PatternMatcher {
    private MorferService morferService = new MorferServiceImpl();

    @Override
    public boolean match(String entry, String pattern) {
        ArrayList<Segment> analyzedEntry = morferService.createModel(entry);
        ArrayList<String> simplifiedEntry = new ArrayList<>();
        Parser parser = new Parser();
        Tokenizer tokenizer = new Tokenizer(pattern, parser);
        analyzedEntry
                .forEach(val -> val.getInterpretations()
                        .forEach(interpretation -> simplifiedEntry.add(interpretation.getLemma() + ":" + interpretation.getTag())));

        return tokenizer.process(simplifiedEntry);
    }

}
