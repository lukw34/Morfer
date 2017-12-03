package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.GrammaticalCategory;
import uek.dev.morfer.result.models.json.FleksemClass;

public class Substantive extends FleksemClass {
    public Substantive(String tag) {
        super("rzeczownik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER
                });

        String[] tagParts = tag.split(":");
        if(tagParts.length > 4) {
            super.setGrammaticalCategory(GrammaticalCategory.PLURAL_TANTUM, tagParts[4]);
        }
    }
}