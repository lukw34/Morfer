package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GrammaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GrammaticalCase;


import java.util.HashMap;
import java.util.Map;

public class GrammaticalCaseRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_CASE_VALUES_MAP;

    static {
        GRAMMATICAL_CASE_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_CASE_VALUES_MAP.put("nom", GrammaticalCase.NOM.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("gen", GrammaticalCase.GEN.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("dat", GrammaticalCase.DAT.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("acc", GrammaticalCase.ACC.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("inst", GrammaticalCase.INST.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("loc", GrammaticalCase.LOC.getValueName());
        GRAMMATICAL_CASE_VALUES_MAP.put("voc", GrammaticalCase.VOC.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_CASE_VALUES_MAP;
    }
}
