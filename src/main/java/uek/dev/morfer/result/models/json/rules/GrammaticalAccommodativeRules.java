package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalAccommodative;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalAccommodativeRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_ACCOMODATIVE_VALUES_MAP;

    static  {
        GRAMMATICAL_ACCOMODATIVE_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_ACCOMODATIVE_VALUES_MAP.put("congr", GrammaticalAccommodative.CONGR.getValueName());
        GRAMMATICAL_ACCOMODATIVE_VALUES_MAP.put("rec", GrammaticalAccommodative.REC.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_ACCOMODATIVE_VALUES_MAP;
    }
}
