package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalGender;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalGenderRules implements GrammaticalCategoryRule {
    private static final Map<String, String> GRAMMATICAL_GENDER_VALUES_MAP;

    static {
        GRAMMATICAL_GENDER_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_GENDER_VALUES_MAP.put("m1", GrammaticalGender.M_1.getValueName());
        GRAMMATICAL_GENDER_VALUES_MAP.put("m2", GrammaticalGender.M_2.getValueName());
        GRAMMATICAL_GENDER_VALUES_MAP.put("m3", GrammaticalGender.M_3.getValueName());
        GRAMMATICAL_GENDER_VALUES_MAP.put("f", GrammaticalGender.F.getValueName());
        GRAMMATICAL_GENDER_VALUES_MAP.put("n", GrammaticalGender.N.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_GENDER_VALUES_MAP;
    }
}
