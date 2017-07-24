package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class DepreciationForm extends FleksemClass {
    public DepreciationForm(String tag) {
        super("rzeczownik", "forma deprecjatywna", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER
                });
    }
}
