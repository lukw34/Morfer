package uek.dev.morfer.result.models.json.rules;
import uek.dev.morfer.result.models.json.Fleksem;
import uek.dev.morfer.result.models.json.FleksemCreator;
import uek.dev.morfer.result.models.json.fleksem.*;

import java.util.HashMap;
import java.util.Map;

public class FleksemRules {

    private static final Map<String, FleksemCreator> FLEKSEMS;

    static {
        FLEKSEMS = new HashMap<>();
        FLEKSEMS.put("subst", Substantive::new);
        FLEKSEMS.put("depr", DepreciationForm::new);
        FLEKSEMS.put("adj", Adjective::new);
        FLEKSEMS.put("aja", AdjectiveAtAdjective::new);
        FLEKSEMS.put("adjp", AdjectivePostAdjective::new);
        FLEKSEMS.put("adjc", AdjectivePredykatywny::new);
        FLEKSEMS.put("adv", Adverb::new);
        FLEKSEMS.put("num", Numeral::new);
        FLEKSEMS.put("ppron12", Pronoun12::new);
        FLEKSEMS.put("ppron3", Pronoun3::new);
        FLEKSEMS.put("siebie", PronounSiebie::new);
        FLEKSEMS.put("fin", VerbNotPast::new);
        FLEKSEMS.put("bedzie", VerbPastBYC::new);
        FLEKSEMS.put("aglt", VerbAglutynantBYC::new);
        FLEKSEMS.put("praet", PseudoParticiple::new);
        FLEKSEMS.put("impt", VerbImperative::new);
        FLEKSEMS.put("imps", VerbImpersonal::new);
        FLEKSEMS.put("inf", VerbInfinitive::new);
        FLEKSEMS.put("pcon", AdverbParticiple::new);
        FLEKSEMS.put("pant", AdverbParticiple::new);
        FLEKSEMS.put("ger", VerbGerundiun::new);
        FLEKSEMS.put("pact", AdjectivalParticiple::new);
        FLEKSEMS.put("ppas", AdjectivalParticiple::new);
        FLEKSEMS.put("winien", VerbWinien::new);
        FLEKSEMS.put("pred", Predykatyw::new);
        FLEKSEMS.put("prep", Preposition::new);
        FLEKSEMS.put("interp", PunctuationMark::new);
        FLEKSEMS.put("conj", Conjunction::new);
        FLEKSEMS.put("comp", Conjunction::new);
        FLEKSEMS.put("interj", Exclamation::new);
        FLEKSEMS.put("burk", Burkinostka::new);
        FLEKSEMS.put("brev", Shortcut::new);
        FLEKSEMS.put("qub", Kublik::new);
        FLEKSEMS.put("ign", Ignored::new);
    }


    public static Fleksem getFleksemClass(String interpretation) {
        String partOfSpeechKey = interpretation.split(":")[0];
        if(FLEKSEMS.containsKey(partOfSpeechKey)) {
            return FLEKSEMS.get(partOfSpeechKey).createFleksem(interpretation);
        }

        return new Ignored(interpretation);
    }
}
