package uek.dev.morfer.result.models.json.parts.of.speech;

import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Substantive implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;

    public Substantive(String interpretation) {
        this.name = "rzeczownik";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[2]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
                interpretationParts[3]);
    }

    @Override
    public String getName() {
        return name;
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
}