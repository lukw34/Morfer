package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbAglutynantBYC extends FleksemClass {
    public VerbAglutynantBYC(String tag) {
        super("czaswonik", "aglutynant BYĆ", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.WOKALICZNOSC,
                });
    }
}