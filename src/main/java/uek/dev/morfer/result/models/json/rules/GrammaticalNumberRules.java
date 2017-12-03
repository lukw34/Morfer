package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalNumber;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalNumberRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_NUMBER_VALUES_MAP;

    static {
        GRAMMATICAL_NUMBER_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_NUMBER_VALUES_MAP.put("sg", GrammaticalNumber.SINGULAR.getValueName());
        GRAMMATICAL_NUMBER_VALUES_MAP.put("pl", GrammaticalNumber.PLURAL.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_NUMBER_VALUES_MAP;
    }
}
