package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalPostPrepositionalityValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalPostPrepositionalityRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_POST_PREPOSITIONALITY_VALUES_MAP;

    static  {
        GRAMATICAL_POST_PREPOSITIONALITY_VALUES_MAP = new HashMap<>();
        GRAMATICAL_POST_PREPOSITIONALITY_VALUES_MAP.put("praep",
                GramaticalPostPrepositionalityValues.PRAEP.getValueName());
        GRAMATICAL_POST_PREPOSITIONALITY_VALUES_MAP.put("npraep",
                GramaticalPostPrepositionalityValues.NPRAEP.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_POST_PREPOSITIONALITY_VALUES_MAP;
    }
}
