package uek.dev.morfer.result.models.json.fleksem;

import uek.dev.morfer.result.models.json.FleksemClass;
import uek.dev.morfer.result.models.json.GrammaticalCategory;

public class VerbWinien extends FleksemClass {
    public VerbWinien(String tag) {
        super("czasownik", "winien", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT
                });
    }
}