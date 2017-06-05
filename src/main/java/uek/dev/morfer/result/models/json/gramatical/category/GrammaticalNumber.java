package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalNumber {
    SINGULAR("liczba pojedyncza"),
    PLURAL("liczba mnoga");
    private final String  valueName;

    GrammaticalNumber(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}