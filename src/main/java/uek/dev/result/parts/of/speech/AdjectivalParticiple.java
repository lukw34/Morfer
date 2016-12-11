package uek.dev.result.parts.of.speech;

import uek.dev.result.GramaticalCategory;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


public class AdjectivalParticiple extends Verb {
    private final String INTERPRETATION;

    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalAspect;
    private ArrayList<String> gramaticalNegate;
    private String fleksem;

    public AdjectivalParticiple(String interpretation) {
        super();
        this.fleksem = "imieslow przymiotnikowy";
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