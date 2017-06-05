package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbPastBYC extends FleksemClass {
    public VerbPastBYC(String tag) {
        super("czasownik", "forma przyszła BYĆ", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT
                });
    }
}