package uek.dev.result.parts.of.speech;


import uek.dev.result.LexemClass;

public class Conjuction implements LexemClass {
    private String name;

    public Conjuction(String interpretation) {
        this.name = "spojnik";
    }

    @Override
    public String getName() {
        return name;
    }
}
