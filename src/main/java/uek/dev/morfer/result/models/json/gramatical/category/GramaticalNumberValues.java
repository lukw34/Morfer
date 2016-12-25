package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalNumberValues {
    SINGULAR("liczba pojedyncza"),
    PLURAL("liczba mnoga");
    private final String  valueName;

    GramaticalNumberValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}