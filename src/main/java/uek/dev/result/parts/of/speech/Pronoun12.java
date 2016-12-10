package uek.dev.result.parts.of.speech;


import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.result.GramaticalCategory;
import uek.dev.result.LexemClass;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pronoun12 implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalPerson;
    private ArrayList<String> gramaticalAccent;

    public Pronoun12(String interpretation) {
        this.INTERPRETATION = interpretation;
        this.name = "Pronoun";
        String[] interpretationParts = INTERPRETATION.split(":");

        gramaticalNumber = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_NUMBER,
                interpretationParts[1]);
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[2]);
        gramaticalGender = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GENDER,
                interpretationParts[3]);
        gramaticalPerson = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_PERSON,
                interpretationParts[4]);
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

    public ArrayList<String> getGramaticalAccent() {
        return gramaticalAccent;
    }

    public ArrayList<String> getGramaticalGender() {
        return gramaticalGender;
    }

    public ArrayList<String> getGramaticalPerson() {
        return gramaticalPerson;
    }
}
