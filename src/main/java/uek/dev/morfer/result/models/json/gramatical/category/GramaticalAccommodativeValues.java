package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalAccommodativeValues {
    CONGR("uzgadniajaca"),
    REC("rzadzaca");
    private final String valueName;

    GramaticalAccommodativeValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}