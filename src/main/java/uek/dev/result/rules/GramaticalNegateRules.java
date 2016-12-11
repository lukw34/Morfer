package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalNegateValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalNegateRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_NEGATE_VALUES_MAP;

    static  {
        GRAMATICAL_NEGATE_VALUES_MAP = new HashMap<>();
        GRAMATICAL_NEGATE_VALUES_MAP.put("aff", GramaticalNegateValues.AFF.getValueName());
        GRAMATICAL_NEGATE_VALUES_MAP.put("neg", GramaticalNegateValues.NEG.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_NEGATE_VALUES_MAP;
    }
}
