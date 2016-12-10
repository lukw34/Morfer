package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

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
