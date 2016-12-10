package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Adverb implements LexemClass {
    private String name;

    public Adverb(String interpretation) {
        this.name = "Adverb";
    }

    @Override
     public String getName() {
        return name;
    }
}
