package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.LexemClass;

public class Verb implements LexemClass {
    private String name;


    public Verb() {
        this.name = "Verb";
    }

    @Override
    public String getName() {
        return name;
    }
}
