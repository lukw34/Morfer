package uek.dev.morfer.result.models.json.rules;

import uek.dev.morfer.result.models.json.GramaticalCategoryRule;
import uek.dev.morfer.result.models.json.gramatical.category.GramaticalGradeValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalGradeRules implements GramaticalCategoryRule {

    private static final Map<String, String> GRAMATICAL_GRADE_VALUES_MAP;

    static  {
        GRAMATICAL_GRADE_VALUES_MAP = new HashMap<>();
        GRAMATICAL_GRADE_VALUES_MAP.put("pos", GramaticalGradeValues.POS.getValueName());
        GRAMATICAL_GRADE_VALUES_MAP.put("com", GramaticalGradeValues.COMP.getValueName());
        GRAMATICAL_GRADE_VALUES_MAP.put("sup", GramaticalGradeValues.SUP.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_GRADE_VALUES_MAP;
    }
}
