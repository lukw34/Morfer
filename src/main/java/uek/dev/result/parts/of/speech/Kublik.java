package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

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
