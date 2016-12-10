package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Pronoun implements LexemClass {
    private String name;

    public Pronoun(String interpretation) {
        this.name = "Pronoun";
    }

    @Override
    public String getName() {
        return name;
    }
}
