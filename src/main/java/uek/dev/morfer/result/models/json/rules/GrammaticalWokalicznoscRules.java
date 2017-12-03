package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalWokalicznosc;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalWokalicznoscRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_WOKALICZNOSC_VALUES_MAP;

    static  {
        GRAMMATICAL_WOKALICZNOSC_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_WOKALICZNOSC_VALUES_MAP.put("wok", GrammaticalWokalicznosc.WOK.getValueName());
        GRAMMATICAL_WOKALICZNOSC_VALUES_MAP.put("nwok", GrammaticalWokalicznosc.NWOK.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_WOKALICZNOSC_VALUES_MAP;
    }
}
