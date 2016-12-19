package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalAccentValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalAccentRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_ACCENT_VALUES_MAP;

    static  {
        GRAMATICAL_ACCENT_VALUES_MAP = new HashMap<>();
        GRAMATICAL_ACCENT_VALUES_MAP.put("akc", GramaticalAccentValues.NAKC.getValueName());
        GRAMATICAL_ACCENT_VALUES_MAP.put("nakc", GramaticalAccentValues.AKC.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_ACCENT_VALUES_MAP;
    }
}
