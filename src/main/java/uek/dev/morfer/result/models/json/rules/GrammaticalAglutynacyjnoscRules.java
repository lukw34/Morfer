package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalAglutynacyjnosc;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalAglutynacyjnoscRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_AGLUTYNACYJNOSC_VALUES_MAP;

    static  {
        GRAMMATICAL_AGLUTYNACYJNOSC_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_AGLUTYNACYJNOSC_VALUES_MAP.put("agl", GrammaticalAglutynacyjnosc.AGL.getValueName());
        GRAMMATICAL_AGLUTYNACYJNOSC_VALUES_MAP.put("nagl", GrammaticalAglutynacyjnosc.NAGL.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_AGLUTYNACYJNOSC_VALUES_MAP;
    }
}
