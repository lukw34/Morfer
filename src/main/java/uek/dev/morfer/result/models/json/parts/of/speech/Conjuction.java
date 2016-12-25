package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.LexemClass;

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
