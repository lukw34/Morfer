package uek.dev.result.rules;


import uek.dev.result.LexemClass;
import uek.dev.result.LexemClassCreator;
import uek.dev.result.parts.of.speech.*;

import java.util.HashMap;
import java.util.Map;

public class LexemClassRules {

    private static final Map<String, LexemClassCreator> LEXEM_CLASSES;

    static {
        LEXEM_CLASSES = new HashMap<>();
        LEXEM_CLASSES.put("subst", Substantive::new);
        LEXEM_CLASSES.put("depr", Substantive::new);
        LEXEM_CLASSES.put("adj", Adjective::new);
        LEXEM_CLASSES.put("aja", Adjective::new);
        LEXEM_CLASSES.put("adjp", Adjective::new);
        LEXEM_CLASSES.put("adv", Adverb::new);
        LEXEM_CLASSES.put("num", Numeral::new);
        LEXEM_CLASSES.put("ppron12", Pronoun12::new);
        LEXEM_CLASSES.put("ppron3", Pronoun3::new);
        LEXEM_CLASSES.put("siebie", PronounSiebie::new);
        LEXEM_CLASSES.put("fin", Verb::new);
        LEXEM_CLASSES.put("bedzie", Verb::new);
        LEXEM_CLASSES.put("aglt", Verb::new);
        LEXEM_CLASSES.put("praet", Verb::new);
        LEXEM_CLASSES.put("impt", Verb::new);
        LEXEM_CLASSES.put("imps", Verb::new);
        LEXEM_CLASSES.put("inf", Verb::new);
        LEXEM_CLASSES.put("pcon", Verb::new);
        LEXEM_CLASSES.put("pant", Verb::new);
        LEXEM_CLASSES.put("ger", Verb::new);
        LEXEM_CLASSES.put("pact", Verb::new);
        LEXEM_CLASSES.put("ppas", Verb::new);
        LEXEM_CLASSES.put("winien", Verb::new);
        LEXEM_CLASSES.put("pred", Predykatyw::new);
        LEXEM_CLASSES.put("prep", Preposition::new);
        LEXEM_CLASSES.put("qub", Kublik::new);
        LEXEM_CLASSES.put("interp", PunctuationMark::new);
        LEXEM_CLASSES.put("conj", Conjuction::new);
        LEXEM_CLASSES.put("ign", Ignored::new);
    }


    public static LexemClass getLexemClass(String interpretation) {
        String partOfSpeechKey = interpretation.split(":")[0];
        if(LEXEM_CLASSES.containsKey(partOfSpeechKey)) {
            return LEXEM_CLASSES.get(partOfSpeechKey).createPartOfSpeech(interpretation);
        }

        return new Ignored(interpretation);
    }
}
