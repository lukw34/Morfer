package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalGrade {
    POS("równy"),
    COMP("wyższy"),
    SUP("najwyższy");
    private final String VALUE_NAME;

    GrammaticalGrade(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}
