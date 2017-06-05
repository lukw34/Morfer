package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbImperative extends FleksemClass {
    public VerbImperative(String tag) {
        super("czasownik", "rozkaźnik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.ASPECT
                });
    }
}