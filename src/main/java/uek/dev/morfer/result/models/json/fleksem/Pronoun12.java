package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.GrammaticalCategory;
import uek.dev.morfer.result.models.json.FleksemClass;

public class Pronoun12 extends FleksemClass {

    public Pronoun12(String tag) {
        super("zaimek", "zaimek nietrzecioosobowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ACCENT
                });
    }
}