package uek.dev.result.partsOfSpeech;


public class Ignored implements PartOfSpeech{
    private String name;

    public Ignored(String interpretation) {
        this.name = "Ignored";
    }

    @Override
    public String getName() {
        return name;
    }
}
