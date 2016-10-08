package uek.dev.result.partsOfSpeech;


public class Pronoun implements PartOfSpeech{
    private String name;

    public Pronoun(String interpretation) {
        this.name = "Pronoun";
    }

    @Override
    public String getName() {
        return name;
    }
}
