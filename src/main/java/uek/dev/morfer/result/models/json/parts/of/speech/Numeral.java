package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Numeral implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalAccommodative;

    public Numeral(String interpretation) {
        this.name = "Numeral";
        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[2]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
                interpretationParts[3]);
        gramaticalAccommodative = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_ACCOMMODATIVE,
                interpretationParts[4]);
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<String> getGramaticalCase() {
        return gramaticalCase;
    }

    public ArrayList<String> getGramaticalNumber() {
        return gramaticalNumber;
    }

    public ArrayList<String> getGramaticalGender() {
        return gramaticalGender;
    }

    public ArrayList<String> getGramaticalAccommodative() {
        return gramaticalAccommodative;
    }
}
