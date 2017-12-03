package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalNeedDot;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalNeedDotRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_NEED_DOT_VALUES_MAP;

    static  {
        GRAMMATICAL_NEED_DOT_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_NEED_DOT_VALUES_MAP.put("pun", GrammaticalNeedDot.PUN.getValueName());
        GRAMMATICAL_NEED_DOT_VALUES_MAP.put("npun", GrammaticalNeedDot.NPUN.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_NEED_DOT_VALUES_MAP;
    }
}
