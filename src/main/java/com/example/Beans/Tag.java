package com.example.Beans;

public class Tag {
    private String lemma;
    private String interpretation;
    private String partOfSpeach;

    public String getPartOfSpeach() {
        return partOfSpeach;
    }

    public void setPartOfSpeach(String partOfSpeach) {
        this.partOfSpeach = partOfSpeach;
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
