package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalNegateValues;

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
