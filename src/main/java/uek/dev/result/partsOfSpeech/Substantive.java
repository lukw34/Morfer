package uek.dev.result.partsOfSpeech;

public class Substantive implements PartOfSpeech{
    private String name;

    public Substantive(String interpretations) {
        this.name = "Substantive";
    }

    @Override
    public String getName() {
        return name;
    }
}
