package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbNotPast extends FleksemClass {
    public VerbNotPast(String tag) {
        super("czasownik", "forma nieprzeszła", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT
                });
    }
}