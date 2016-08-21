package com.example.result;

public class Tag {
    private String lemma;
    private String interpretation;
    private PartOfSpeech partOfSpeech;

    public Tag(String interpretation, String lemma, PartOfSpeech partOfSpeach) {
        this.interpretation = interpretation;
        this.lemma = lemma;
        this.partOfSpeech = partOfSpeach;
    }

    public String getPartOfSpeech() {
        return partOfSpeech.getName();
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
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
