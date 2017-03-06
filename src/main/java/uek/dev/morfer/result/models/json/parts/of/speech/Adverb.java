package uek.dev.morfer.result.models.json.parts.of.speech;
import uek.dev.morfer.result.models.json.GramaticalCategory;
import uek.dev.morfer.result.models.json.LexemClass;
import uek.dev.morfer.result.models.json.rules.GramaticalCategoryRulesInterpreter;

import java.util.ArrayList;

public class Adverb implements LexemClass {
    private final String INTERPRETATION;

    private String name;
    private ArrayList<String> gramaticalGrade;

    public Adverb(String interpretation) {
        this.gramaticalGrade = new ArrayList<>();
        this.INTERPRETATION = interpretation;
        this.name = "Adverb";
        String[] interpretationParts = INTERPRETATION.split(":");
        if(interpretationParts.length > 1) {
            gramaticalGrade = GramaticalCategoryRulesInterpreter.getValues(GramaticalCategory.GRAMATICAL_GRADE,
                    interpretationParts[1]);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<String> getGramaticalGrade() {
        return gramaticalGrade;
    }
}
