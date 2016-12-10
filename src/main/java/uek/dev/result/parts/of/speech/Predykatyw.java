package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

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
