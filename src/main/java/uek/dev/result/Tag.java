package uek.dev.result;

import uek.dev.result.partsOfSpeech.PartOfSpeech;
import uek.dev.result.rules.PartOfSpeechRules;

public class Tag {
    private String lemma;
    private String interpretation;
    private PartOfSpeech PartOfSpeach;

    public Tag(String interpretation, String lemma) {
        this.interpretation = interpretation;
        this.lemma = lemma;
        this.PartOfSpeach = PartOfSpeechRules.getPartsOfSpeech(interpretation);
    }

    public PartOfSpeech getPartOfSpeach() {
        return PartOfSpeach;
    }

    public void setPartOfSpeach(PartOfSpeech partOfSpeach) {
        PartOfSpeach = partOfSpeach;
    }

    public String getLemma() {
        return lemma;
    }

    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }
}
