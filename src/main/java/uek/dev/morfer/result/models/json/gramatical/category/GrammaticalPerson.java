package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalPerson {
    PRI("pierwsza"),
    SEC("druga"),
    TER("trzecia");
    private final String valueName;

    GrammaticalPerson(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}