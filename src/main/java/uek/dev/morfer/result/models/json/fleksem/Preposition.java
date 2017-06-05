package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class Preposition extends FleksemClass {
    public Preposition(String tag) {
        super("przyimek", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.WOKALICZNOSC
                });
    }
}