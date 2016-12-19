package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalAccentValues {
    AKC("akcentowana"),
    NAKC("nieakcentowana");
    private final String valueName;

    GramaticalAccentValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}