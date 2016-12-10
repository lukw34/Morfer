package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalAccommodativeValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalAccommodativeRules implements GramaticalCategoryRule {

    private static final String UNDEFINED = "undefined";
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
