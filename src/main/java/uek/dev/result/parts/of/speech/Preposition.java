package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Preposition implements LexemClass {
    private String name;

    public Preposition(String interpretation) {
        this.name = "Preposition";
    }

    @Override
    public String getName() {
        return name;
    }
}
