package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.LexemClass;

public class Kublik implements LexemClass {
    private String name;

    public Kublik(String interpretation) {
        this.name = "kublik";
    }

    @Override
    public String getName() {
        return name;
    }
}
