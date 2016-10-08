package uek.dev.result.partsOfSpeech;


public class Verb implements PartOfSpeech{
    private String name;

    public Verb(String interpretation) {
        this.name = "Verb";
    }

    @Override
    public String getName() {
        return name;
    }
}
