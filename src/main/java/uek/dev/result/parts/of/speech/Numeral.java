package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Numeral implements LexemClass {
    private String name;

    public Numeral(String interpretation) {
        this.name = "Numeral";
    }

    @Override
    public String getName() {
        return name;
    }
}
