package uek.dev.result.gramatical.category;

public enum GramaticalPersonValues {
    PRI("pierwsza"),
    SEC("druga"),
    TER("trzecia");
    private final String valueName;

    GramaticalPersonValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}