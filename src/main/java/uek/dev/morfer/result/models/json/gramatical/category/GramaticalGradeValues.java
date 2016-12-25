package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalGradeValues {
    POS("rowny"),
    COMP("wyzszy"),
    SUP("najwyzszy");
    private final String VALUE_NAME;

    GramaticalGradeValues(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}
