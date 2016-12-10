package uek.dev.result.parts.of.speech;


import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.result.GramaticalCategory;
import uek.dev.result.LexemClass;
import uek.dev.result.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PronounSiebie implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalCase;

    public PronounSiebie(String interpretation) {
        this.INTERPRETATION = interpretation;
        this.name = "Pronoun";
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
