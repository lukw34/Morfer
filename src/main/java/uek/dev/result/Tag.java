package uek.dev.result;

import uek.dev.result.rules.LexemClassRules;

public class Tag {
    private String lemma;
    private String interpretation;
    private LexemClass lexemClass;

    public Tag(String interpretation, String lemma) {
        this.interpretation = interpretation;
        this.lemma = lemma;
        this.lexemClass = LexemClassRules.getLexemClass(interpretation);
    }

    public LexemClass getLexemeClass() {
        return lexemClass;
    }

    public void setLexemClass(LexemClass partOfSpeach) {
        lexemClass = partOfSpeach;
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
