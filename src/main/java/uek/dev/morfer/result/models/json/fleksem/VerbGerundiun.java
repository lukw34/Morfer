package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbGerundiun extends FleksemClass {
    public VerbGerundiun(String tag) {
        super("czasownik", "odsłownik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.NEGATE
                });
    }
}