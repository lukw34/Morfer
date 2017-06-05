package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalAspect;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalAspectRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_ASPECT_VALUES_MAP;

    static  {
        GRAMATICAL_ASPECT_VALUES_MAP = new HashMap<>();
        GRAMATICAL_ASPECT_VALUES_MAP.put("imperf", GrammaticalAspect.IMPERF.getValueName());
        GRAMATICAL_ASPECT_VALUES_MAP.put("perf", GrammaticalAspect.PERF.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMATICAL_ASPECT_VALUES_MAP;
    }
}
