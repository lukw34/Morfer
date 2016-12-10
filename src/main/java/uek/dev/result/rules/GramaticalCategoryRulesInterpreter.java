package uek.dev.result.rules;

import uek.dev.result.GramaticalCategory;
import uek.dev.result.GramaticalCategoryRule;

import java.util.ArrayList;
import java.util.Map;

public class GramaticalCategoryRulesInterpreter {
    private final static String UNDEFINED = "undefined";

    public static ArrayList<String> getValues(GramaticalCategory gramaticalCategory, String value) {
        String[] values = value.split("\\.");
        ArrayList<String> results = new ArrayList<>();
        Map<String, String> rule = getRuleForGramaticalCategory(gramaticalCategory);
        if(rule == null) {
            return results;
        }

        for (String v : values) {
            if(rule.containsKey(v)) {
                results.add(rule.get(v));
            } else {
                results.add(UNDEFINED);
            }
        }

        return results;
    }

    private static Map<String, String> getRuleForGramaticalCategory(GramaticalCategory gramaticalCategory) {
        GramaticalCategoryRule rule;
        switch (gramaticalCategory) {
            case GRAMATICAL_NUMBER:
                rule = new GramaticalNumberRules();
                break;
            case GRAMATICAL_CASE:
                rule = new GramaticalCaseRules();
                break;
            case GRAMATICAL_GENDER:
                rule = new GramaticalGenderRules();
                break;
            case GRAMATICAL_GRADE:
                rule = new GramaticalGradeRules();
                break;
            default:
                return null;
        }

        return rule.getRule();
    }
}
