package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalNegate;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalNegateRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_NEGATE_VALUES_MAP;

    static  {
        GRAMMATICAL_NEGATE_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_NEGATE_VALUES_MAP.put("aff", GrammaticalNegate.AFF.getValueName());
        GRAMMATICAL_NEGATE_VALUES_MAP.put("neg", GrammaticalNegate.NEG.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_NEGATE_VALUES_MAP;
    }
}
