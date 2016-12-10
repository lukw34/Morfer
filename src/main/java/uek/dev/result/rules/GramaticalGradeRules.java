package uek.dev.result.rules;

import uek.dev.result.GramaticalCategoryRule;
import uek.dev.result.gramatical.category.GramaticalGradeValues;

import java.util.HashMap;
import java.util.Map;

public class GramaticalGradeRules implements GramaticalCategoryRule {

    private static final String UNDEFINED = "undefined";
    private static final Map<String, String> GRAMATICAL_GRADE_VALUES_MAP;

    static  {
        GRAMATICAL_GRADE_VALUES_MAP = new HashMap<>();
        GRAMATICAL_GRADE_VALUES_MAP.put("pos", GramaticalGradeValues.POS.getValueName());
        GRAMATICAL_GRADE_VALUES_MAP.put("comp", GramaticalGradeValues.COMP.getValueName());
        GRAMATICAL_GRADE_VALUES_MAP.put("sup", GramaticalGradeValues.SUP.getValueName());
    }

    @Override
    public Map<String, String> getRule() {
        return GRAMATICAL_GRADE_VALUES_MAP;
    }
}
