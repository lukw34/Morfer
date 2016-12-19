package uek.dev.morfer.result.models.json.gramatical.category;

public enum GramaticalGenderValues {
    M_1("meski osobowy"),
    M_2("meski zwierzecy"),
    M_3("meski rzeczoyw"),
    F("zenski"),
    N_1("nijaki zbiorowy"),
    N_2("nijaki zwykły"),
    P_1("przymnogi osobowy"),
    P_2("przymnogi zwykly"),
    P_3("przymnogi opisowy");

    private final String  VALUE_NAME;


    GramaticalGenderValues(String valueName) {
        this.VALUE_NAME = valueName;
    }

    public String getValueName() {
        return VALUE_NAME;
    }
}
