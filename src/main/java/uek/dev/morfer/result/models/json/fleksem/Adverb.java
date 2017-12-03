package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class Adverb extends FleksemClass {
    public Adverb(String tag) {
        super("przysłówek", tag, new GrammaticalCategory[]{
                GrammaticalCategory.GRADE
        });
    }
}