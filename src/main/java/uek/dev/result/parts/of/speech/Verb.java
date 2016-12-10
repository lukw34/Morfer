package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Verb implements LexemClass {
    private String name;

    public Verb(String interpretation) {
        this.name = "Verb";
    }

    @Override
    public String getName() {
        return name;
    }
}
