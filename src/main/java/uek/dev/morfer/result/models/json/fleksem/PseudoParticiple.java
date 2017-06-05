package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class PseudoParticiple extends FleksemClass {
    public PseudoParticiple(String tag) {
        super("czasownik", "pseudoimiesłów", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT
                });
    }
}