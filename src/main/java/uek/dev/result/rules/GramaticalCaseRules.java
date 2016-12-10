package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalCaseValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalCaseRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_CASE_VALUES_MAP;

    static {
        GRAMATICAL_CASE_VALUES_MAP = new HashMap<>();
        GRAMATICAL_CASE_VALUES_MAP.put("nom", GramaticalCaseValues.NOM.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("gen", GramaticalCaseValues.GEN.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("dat", GramaticalCaseValues.DAT.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("acc", GramaticalCaseValues.ACC.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("inst", GramaticalCaseValues.INST.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("loc", GramaticalCaseValues.LOC.getValueName());
        GRAMATICAL_CASE_VALUES_MAP.put("voc", GramaticalCaseValues.VOC.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_CASE_VALUES_MAP;
    }
}
