package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalPersonValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalPersonRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_PERSON_VALUES_MAP;

    static  {
        GRAMATICAL_PERSON_VALUES_MAP = new HashMap<>();
        GRAMATICAL_PERSON_VALUES_MAP.put("pri", GramaticalPersonValues.PRI.getValueName());
        GRAMATICAL_PERSON_VALUES_MAP.put("sec", GramaticalPersonValues.SEC.getValueName());
        GRAMATICAL_PERSON_VALUES_MAP.put("ter", GramaticalPersonValues.TER.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_PERSON_VALUES_MAP;
    }
}
