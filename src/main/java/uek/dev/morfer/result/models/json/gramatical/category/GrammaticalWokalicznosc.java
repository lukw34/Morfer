package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalWokalicznosc {
    WOK("wokaliczna"),
    NWOK("niewokaliczna");
    private final String valueName;

    GrammaticalWokalicznosc(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}