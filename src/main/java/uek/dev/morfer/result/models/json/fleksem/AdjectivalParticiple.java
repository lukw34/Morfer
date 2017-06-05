package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.Fleksem;
import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class AdjectivalParticiple extends FleksemClass {

    public AdjectivalParticiple(String tag) {
        super("czasownik", "imiesłów przymiotnikowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.NEGATE
                });
    }
}