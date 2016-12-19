package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalNegateValues {
    AFF("niezanegowana"),
    NEG("zanegowana");
    private final String valueName;

    GramaticalNegateValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}