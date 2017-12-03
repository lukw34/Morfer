package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalPostPrepositionality;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalPostPrepositionalityRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_POST_PREPOSITIONALITY_VALUES_MAP;

    static  {
        GRAMMATICAL_POST_PREPOSITIONALITY_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_POST_PREPOSITIONALITY_VALUES_MAP.put("praep",
                GrammaticalPostPrepositionality.PRAEP.getValueName());
        GRAMMATICAL_POST_PREPOSITIONALITY_VALUES_MAP.put("npraep",
                GrammaticalPostPrepositionality.NPRAEP.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_POST_PREPOSITIONALITY_VALUES_MAP;
    }
}
