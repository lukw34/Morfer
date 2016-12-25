package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.LexemClass;

public class Ignored implements LexemClass {
    private String name;

    public Ignored(String interpretation) {
        this.name = "Ignored";
    }

    @Override
    public String getName() {
        return name;
    }
}
