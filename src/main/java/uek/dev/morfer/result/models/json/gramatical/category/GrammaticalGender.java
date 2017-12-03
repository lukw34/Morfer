package uek.dev.morfer.result.models.json.gramatical.category;

public enum GrammaticalGender {
    M_1("męski osobowy"),
    M_2("męski zwierzęcy"),
    M_3("męski rzeczowy"),
    F("żeński"),
    N("nijaki ");

    private final String VALUE_NAME;

    GrammaticalGender(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}
