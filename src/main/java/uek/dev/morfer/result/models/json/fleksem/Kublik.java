package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class Kublik extends FleksemClass {
    public Kublik(String tag) {
        super("kublik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.WOKALICZNOSC
                });
    }
}