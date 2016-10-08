package uek.dev.result.partsOfSpeech;


public class Numeral implements PartOfSpeech{
    private String name;

    public Numeral(String interpretation) {
        this.name = "Numeral";
    }

    @Override
    public String getName() {
        return name;
    }
}
