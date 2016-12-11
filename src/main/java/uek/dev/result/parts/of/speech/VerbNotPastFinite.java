package uek.dev.result.parts.of.speech;

import uek.dev.result.GramaticalCategory;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


public class VerbNotPastFinite extends Verb {
    private final String INTERPRETATION;

    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalPerson;
    private ArrayList<String> gramaticalAspect;
    private String fleksem;

    public VerbNotPastFinite(String interpretation) {
        super();
        this.fleksem = "nieprzeszla forma finitywna czasownika";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalPerson = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_PERSON,
                interpretationParts[2]);
        gramaticalAspect = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_ASPECT,
                interpretationParts[3]);
    }

    public String getFleksem() {
        return fleksem;
    }

    public ArrayList<String> getGramaticalNumber() {
        return gramaticalNumber;
    }

    public ArrayList<String> getGramaticalPerson() {
        return gramaticalPerson;
    }

    public ArrayList<String> getGramaticalAspect() {
        return gramaticalAspect;
    }
}