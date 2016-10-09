package uek.dev.result.rules;


import uek.dev.result.PartOfSpeechCreator;
import uek.dev.result.partsOfSpeech.*;

import java.util.HashMap;
import java.util.Map;

public class PartOfSpeechRules {

    private static final Map<String, PartOfSpeechCreator> partsOfSpeech;

    static {
        partsOfSpeech = new HashMap<>();
        partsOfSpeech.put("subst", Substantive::new);
        partsOfSpeech.put("depr", Substantive::new);
        partsOfSpeech.put("adj", Adjective::new);
        partsOfSpeech.put("aja", Adjective::new);
        partsOfSpeech.put("adjp", Adjective::new);
        partsOfSpeech.put("adv", Adverb::new);
        partsOfSpeech.put("num", Numeral::new);
        partsOfSpeech.put("ppron12", Pronoun::new);
        partsOfSpeech.put("ppron3", Pronoun::new);
        partsOfSpeech.put("siebie", Pronoun::new);
        partsOfSpeech.put("fin", Verb::new);
        partsOfSpeech.put("bedzie", Verb::new);
        partsOfSpeech.put("aglt", Verb::new);
        partsOfSpeech.put("praet", Verb::new);
        partsOfSpeech.put("impt", Verb::new);
        partsOfSpeech.put("imps", Verb::new);
        partsOfSpeech.put("inf", Verb::new);
        partsOfSpeech.put("pcon", Verb::new);
        partsOfSpeech.put("pant", Verb::new);
        partsOfSpeech.put("ger", Verb::new);
        partsOfSpeech.put("pact", Verb::new);
        partsOfSpeech.put("ppas", Verb::new);
        partsOfSpeech.put("winien", Verb::new);
        partsOfSpeech.put("pred", Predykatyw::new);
        partsOfSpeech.put("prep", Preposition::new);
        partsOfSpeech.put("qub", Kublik::new);
        partsOfSpeech.put("interp", PunctuationMark::new);
        partsOfSpeech.put("ign", Ignored::new);
    }


    public static PartOfSpeech getPartsOfSpeech(String interpretation) {
        String partOfSpeechKey = interpretation.split(":")[0];
        if(partsOfSpeech.containsKey(partOfSpeechKey)) {
            return partsOfSpeech.get(partOfSpeechKey).createPartOfSpeech(interpretation);
        }

        return new Ignored(interpretation);
    }
}
