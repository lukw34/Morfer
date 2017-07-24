package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalPerson;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalPersonRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_PERSON_VALUES_MAP;

    static  {
        GRAMMATICAL_PERSON_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_PERSON_VALUES_MAP.put("pri", GrammaticalPerson.PRI.getValueName());
        GRAMMATICAL_PERSON_VALUES_MAP.put("sec", GrammaticalPerson.SEC.getValueName());
        GRAMMATICAL_PERSON_VALUES_MAP.put("ter", GrammaticalPerson.TER.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_PERSON_VALUES_MAP;
    }
}
