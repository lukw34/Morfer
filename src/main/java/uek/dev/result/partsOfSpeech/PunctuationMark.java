package uek.dev.result.partsOfSpeech;

public class PunctuationMark implements PartOfSpeech {
    private String name;

    public PunctuationMark(String interpretation) {
        this.name = "Punctuation mark";
    }

    @Override
    public String getName() {
        return name;
    }
}
