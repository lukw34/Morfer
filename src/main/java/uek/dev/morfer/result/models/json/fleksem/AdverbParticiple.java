package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class AdverbParticiple extends FleksemClass {
    public AdverbParticiple(String tag) {
        super("czasownik", "imiesłów przysłówkowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.ASPECT
                });
    }
}