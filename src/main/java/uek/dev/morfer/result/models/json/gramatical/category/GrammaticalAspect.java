package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalAspect {
    IMPERF("niedokonany"),
    PERF("dokonany");
    private final String valueName;

    GrammaticalAspect(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}