package uek.dev.morfer.result.models.json.parts.of.speech;

import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


public class VerbGerundiun extends Verb {
    private final String INTERPRETATION;

    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalAspect;
    private ArrayList<String> gramaticalNegate;
    private String fleksem;

    public VerbGerundiun(String interpretation) {
        super();
        this.fleksem = "odslownik";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[2]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
                interpretationParts[3]);
        gramaticalAspect = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_ASPECT,
                interpretationParts[4]);
        gramaticalNegate = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NEGATE,
                interpretationParts[5]);
    }

    public String getFleksem() {
        return fleksem;
    }

    public ArrayList<String> getGramaticalNumber() {
        return gramaticalNumber;
    }

    public ArrayList<String> getGramaticalCase() {
        return gramaticalCase;
    }

    public ArrayList<String> getGramaticalGender() {
        return gramaticalGender;
    }

    public ArrayList<String> getGramaticalAspect() {
        return gramaticalAspect;
    }

    public ArrayList<String> getGramaticalNegate() {
        return gramaticalNegate;
    }
}