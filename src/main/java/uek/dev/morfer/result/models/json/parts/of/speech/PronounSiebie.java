package uek.dev.morfer.result.models.json.parts.of.speech;


import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PronounSiebie implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalCase;

    public PronounSiebie(String interpretation) {
        this.name = "Pronoun";
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
