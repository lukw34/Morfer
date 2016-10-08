package uek.dev.result.partsOfSpeech;


public class Adverb implements PartOfSpeech {
    private String name;

    public Adverb(String interpretation) {
        this.name = "Adverb";
    }

    @Override
    public String getName() {
        return name;
    }
}
