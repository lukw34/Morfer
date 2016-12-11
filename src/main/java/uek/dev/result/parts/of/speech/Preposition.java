package uek.dev.result.parts.of.speech;


import uek.dev.result.GramaticalCategory;
import uek.dev.result.LexemClass;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Preposition implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalCase;

    public Preposition(String interpretation) {
        this.name = "Preposition";

        this.INTERPRETATION = interpretation;
        String[] interpretationParts = INTERPRETATION.split(":");
        gramaticalCase = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_CASE,
                interpretationParts[1]);
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<String> getGramaticalCase() {
        return gramaticalCase;
    }
}
