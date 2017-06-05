package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalAccent;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalAccentRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_ACCENT_VALUES_MAP;

    static  {
        GRAMMATICAL_ACCENT_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_ACCENT_VALUES_MAP.put("akc", GrammaticalAccent.NAKC.getValueName());
        GRAMMATICAL_ACCENT_VALUES_MAP.put("nakc", GrammaticalAccent.AKC.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_ACCENT_VALUES_MAP;
    }
}
