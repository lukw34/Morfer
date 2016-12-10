package uek.dev.result.parts.of.speech;

import uek.dev.result.LexemClass;

public class Substantive implements LexemClass {
    private String name;

    public Substantive(String interpretations) {
        this.name = "Substantive";
    }

    @Override
    public String getName() {
        return name;
    }
}
