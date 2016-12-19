package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalAspectValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalAspectRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_ASPECT_VALUES_MAP;

    static  {
        GRAMATICAL_ASPECT_VALUES_MAP = new HashMap<>();
        GRAMATICAL_ASPECT_VALUES_MAP.put("imperf", GramaticalAspectValues.IMPERF.getValueName());
        GRAMATICAL_ASPECT_VALUES_MAP.put("perf", GramaticalAspectValues.PERF.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_ASPECT_VALUES_MAP;
    }
}
