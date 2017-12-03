package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalPluralTantum;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalPluralTantumRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_PLURAL_TANTUM_VALUES_MAP;

    static  {
        GRAMMATICAL_PLURAL_TANTUM_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_PLURAL_TANTUM_VALUES_MAP.put("pt", GrammaticalPluralTantum.PT.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_PLURAL_TANTUM_VALUES_MAP;
    }
}
