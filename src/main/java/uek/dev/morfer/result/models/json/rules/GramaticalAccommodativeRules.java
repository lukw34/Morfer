package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalAccommodativeValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalAccommodativeRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_ACCOMODATIVE_VALUES_MAP;

    static  {
        GRAMATICAL_ACCOMODATIVE_VALUES_MAP = new HashMap<>();
        GRAMATICAL_ACCOMODATIVE_VALUES_MAP.put("congr", GramaticalAccommodativeValues.CONGR.getValueName());
        GRAMATICAL_ACCOMODATIVE_VALUES_MAP.put("rec", GramaticalAccommodativeValues.REC.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_ACCOMODATIVE_VALUES_MAP;
    }
}
