package uek.dev.result.gramatical.category;

public enum GramaticalCaseValues {
    NOM("nominative"),
    GEN("genitive"),
    DAT("dative"),
    ACC("accusative"),
    INST("instrumental case"),
    LOC("locative"),
    VOC("vocative");
    private final String VALUE_NAME;

    GramaticalCaseValues(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}