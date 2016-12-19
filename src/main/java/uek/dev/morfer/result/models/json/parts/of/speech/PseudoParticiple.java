package uek.dev.morfer.result.models.json.parts.of.speech;

import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


public class PseudoParticiple extends Verb {
    private final String INTERPRETATION;

    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalAspect;
    private String fleksem;

    public PseudoParticiple(String interpretation) {
        super();
        this.fleksem = "pseudoimieslow";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
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

    public ArrayList<String> getGramaticalGender() {
        return gramaticalGender;
    }

    public ArrayList<String> getGramaticalAspect() {
        return gramaticalAspect;
    }
}