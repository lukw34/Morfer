package uek.dev.morfer.result.models.json.parts.of.speech;

import uek.dev.morfer.result.models.json.LexemClass;

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
