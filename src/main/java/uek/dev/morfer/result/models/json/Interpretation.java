package uek.dev.morfer.result.models.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.rules.FleksemRules;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Interpretation {
    private String lemma;
    private String tag;

    private Fleksem fleksemClass;

    public Interpretation(String tag, String lemma) {
        this.tag = tag;
        this.lemma = lemma;
        this.fleksemClass = FleksemRules.getFleksemClass(tag);
    }

    public String getLemma() {
        return this.lemma;
    }

    public String getTag() {
        return this.tag;
    }

    public String getFleksem() {
        return this.fleksemClass.getFleksem();
    }

    public String getCzescMowy() {
        return this.fleksemClass.getWordClass();
    }

    public GrammaticalCategories getKategorieGramatyczne() {
        return  this.fleksemClass.getGrammaticalCategories();
    }
}
