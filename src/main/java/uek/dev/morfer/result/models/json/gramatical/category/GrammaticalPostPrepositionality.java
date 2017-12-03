package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalPostPrepositionality {
    PRAEP("poprzyimkowa"),
    NPRAEP("niepoprzyimkowa");
    private final String valueName;

    GrammaticalPostPrepositionality(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}