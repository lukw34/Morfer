package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalCaseValues {
    NOM("mianownik"),
    GEN("dopelniacz"),
    DAT("celownik"),
    ACC("biernik"),
    INST("narzednik"),
    LOC("miejscownik"),
    VOC("wolacz");
    private final String VALUE_NAME;

    GramaticalCaseValues(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}