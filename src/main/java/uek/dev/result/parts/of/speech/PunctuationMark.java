package uek.dev.result.parts.of.speech;

import uek.dev.result.LexemClass;

public class PunctuationMark implements LexemClass {
    private String name;

    public PunctuationMark(String interpretation) {
        this.name = "Punctuation mark";
    }

    @Override
    public String getName() {
        return name;
    }
}
