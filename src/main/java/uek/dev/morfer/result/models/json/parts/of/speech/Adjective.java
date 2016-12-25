package uek.dev.morfer.result.models.json.parts.of.speech;


import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Adjective implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalGrade;

    public Adjective(String interpretation) {
        this.INTERPRETATION = interpretation;
        this.name = "przymiotnik";
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[2]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
                interpretationParts[3]);
        gramaticalGrade = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GRADE,
                interpretationParts[4]);
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getGramaticalCase() {
        return gramaticalCase;
    }

    public ArrayList<String> getGramaticalGender() {
        return gramaticalGender;
    }

    public ArrayList<String> getGramaticalGrade() {
        return gramaticalGrade;
    }

    public ArrayList<String> getGramaticalNumber() {
        return gramaticalNumber;
    }

}
