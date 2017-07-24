package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalAglutynacyjnosc {
    AGL("aglutynacyjna"),
    NAGL("nieaglutynacyjna");
    private final String valueName;

    GrammaticalAglutynacyjnosc(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}