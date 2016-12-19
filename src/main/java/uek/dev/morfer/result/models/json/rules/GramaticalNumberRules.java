package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalNumberValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalNumberRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_NUMBER_VALUES_MAP ;

    static  {
        GRAMATICAL_NUMBER_VALUES_MAP = new HashMap<>();
        GRAMATICAL_NUMBER_VALUES_MAP.put("sg", GramaticalNumberValues.SINGULAR.getValueName());
        GRAMATICAL_NUMBER_VALUES_MAP.put("pl", GramaticalNumberValues.PLURAL.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_NUMBER_VALUES_MAP;
    }
}