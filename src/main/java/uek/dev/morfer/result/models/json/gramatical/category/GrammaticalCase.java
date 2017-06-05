package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalCase {
    NOM("mianownik"),
    GEN("dopełniacz"),
    DAT("celownik"),
    ACC("biernik"),
    INST("narzędnik"),
    LOC("miejscownik"),
    VOC("wołacz");
    private final String VALUE_NAME;

    GrammaticalCase(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}