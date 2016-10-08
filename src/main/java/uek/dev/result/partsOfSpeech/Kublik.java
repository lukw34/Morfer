package uek.dev.result.partsOfSpeech;


public class Kublik implements PartOfSpeech{
    private String name;

    public Kublik(String interpretation) {
        this.name = "Kublik";
    }

    @Override
    public String getName() {
        return name;
    }
}
