package uek.dev.result.partsOfSpeech;


public class Adjective implements PartOfSpeech{
    private String name;

    public Adjective(String interpretation) {
        this.name = "Adjective";
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
