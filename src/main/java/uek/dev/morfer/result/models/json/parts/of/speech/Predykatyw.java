package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.LexemClass;

public class Predykatyw implements LexemClass {
    private String name;

    public Predykatyw(String interpretation) {
        this.name = "Predykatyw";
    }

    @Override
    public String getName() {
        return name;
    }
}
