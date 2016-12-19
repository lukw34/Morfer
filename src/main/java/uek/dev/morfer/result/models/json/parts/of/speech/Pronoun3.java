package uek.dev.morfer.result.models.json.parts.of.speech;


import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pronoun3 implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalNumber;
    private ArrayList<String> gramaticalCase;
    private ArrayList<String> gramaticalGender;
    private ArrayList<String> gramaticalPerson;
    private ArrayList<String> gramaticalAccent;
    private ArrayList<String> gramaticalPostPrepositionality;

    public Pronoun3(String interpretation) {
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
        gramaticalAccent = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_ACCENT,
                interpretationParts[5]);
        gramaticalPostPrepositionality = GramaticalCategoryRulesInterpreter
                .getValues(GramaticalCategory.GRAMATICAL_POST_PREPOSITIONALITY, interpretationParts[6]);
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

    public ArrayList<String> getGramaticalAccent() {
        return gramaticalAccent;
    }

    public ArrayList<String> getGramaticalPerson() {
        return gramaticalPerson;
    }

    public ArrayList<String> getGramaticalPostPrepositionality() {
        return gramaticalPostPrepositionality;
    }
}