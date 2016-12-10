package uek.dev.result.parts.of.speech;


import uek.dev.result.GramaticalCategory;
import uek.dev.result.LexemClass;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Adverb implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalGrade;

    public Adverb(String interpretation) {
        this.INTERPRETATION = interpretation;
        this.name = "Adverb";
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalGrade = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GRADE,
                interpretationParts[1]);
    }
    @Override
     public String getName() {
        return name;
    }

    public ArrayList<String> getGramaticalGrade() {
        return gramaticalGrade;
    }
}
