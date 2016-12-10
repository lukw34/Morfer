package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalGenderValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalGenderRules implements GramaticalCategoryRule {
    private static final Map<String, String> GRAMATICAL_GENDER_VALUES_MAP;

    static {
        GRAMATICAL_GENDER_VALUES_MAP = new HashMap<>();
        GRAMATICAL_GENDER_VALUES_MAP.put("m1", GramaticalGenderValues.M_1.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("m2", GramaticalGenderValues.M_2.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("m3", GramaticalGenderValues.M_3.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("f", GramaticalGenderValues.F.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("n1", GramaticalGenderValues.N_1.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("n2", GramaticalGenderValues.N_2.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("p1", GramaticalGenderValues.P_1.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("p2", GramaticalGenderValues.P_2.getValueName());
        GRAMATICAL_GENDER_VALUES_MAP.put("p3", GramaticalGenderValues.P_3.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_GENDER_VALUES_MAP;
    }
}
