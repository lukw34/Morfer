package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class Shortcut extends FleksemClass {
    public Shortcut(String tag) {
        super("skrót", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NEED_DOT
                });
    }
}