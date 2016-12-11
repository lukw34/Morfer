package uek.dev.result.gramatical.category;

public enum GramaticalAspectValues {
    IMPERF("niedokonany"),
    PERF("dokonany");
    private final String valueName;

    GramaticalAspectValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}