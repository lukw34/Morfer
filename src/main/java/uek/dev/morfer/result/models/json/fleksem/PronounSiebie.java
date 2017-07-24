package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.GrammaticalCategory;
import uek.dev.morfer.result.models.json.FleksemClass;

public class PronounSiebie extends FleksemClass {
    public PronounSiebie(String tag) {
        super("zaimek", "zaimek SIEBIE", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.CASE
                });
    }
}