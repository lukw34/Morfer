package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbInfinitive extends FleksemClass {
    public VerbInfinitive(String tag) {
        super("czasownik", "bezokolicznik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.ASPECT
                });
    }
}