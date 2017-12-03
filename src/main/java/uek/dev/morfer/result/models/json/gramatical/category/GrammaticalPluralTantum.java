package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalPluralTantum {
    PT("plural tantum");
    private final String valueName;

    GrammaticalPluralTantum(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}