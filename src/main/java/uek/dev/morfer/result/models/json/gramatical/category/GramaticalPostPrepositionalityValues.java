package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalPostPrepositionalityValues {
    PRAEP("poprzyimkowa"),
    NPRAEP("niepoprzyimkowa");
    private final String valueName;

    GramaticalPostPrepositionalityValues(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}