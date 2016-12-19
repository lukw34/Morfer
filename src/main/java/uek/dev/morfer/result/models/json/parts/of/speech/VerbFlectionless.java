package uek.dev.morfer.result.models.json.parts.of.speech;

import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


public class VerbFlectionless extends Verb {
    private final String INTERPRETATION;


    private ArrayList<String> gramaticalAspect;
    private String fleksem;

    public VerbFlectionless(String interpretation) {
        super();
        this.fleksem = "czasowniki nieodmienne";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalAspect = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_ASPECT,
                interpretationParts[1]);
    }

    public String getFleksem() {
        return fleksem;
    }

    public ArrayList<String> getGramaticalAspect() {
        return gramaticalAspect;
    }
}