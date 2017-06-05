package uek.dev.morfer.result.models.json;

public class FleksemClass implements Fleksem {
    private String wordClass;
    private String fleksem;
    private GrammaticalCategories grammaticalCategories;

    public FleksemClass(String wordClass, String fleksem, String tag, GrammaticalCategory[] grammaticalCategories) {
        this.wordClass = wordClass;
        this.fleksem = fleksem;
        String[] tagParts = tag.split(":");
        this.grammaticalCategories = new GrammaticalCategories();
        int size = Math.min(tagParts.length - 1, grammaticalCategories.length);
        for (int index = 0; index < size; index++) {
            this.grammaticalCategories.interpretRules(grammaticalCategories[index], tagParts[index + 1]);
        }
    }

    public FleksemClass(String wordClass, String tag, GrammaticalCategory[] grammaticalCategories) {
        this(wordClass, wordClass, tag, grammaticalCategories);
    }

    public FleksemClass(String wordClass, String fleksem) {
        this(wordClass, fleksem, "", new GrammaticalCategory[]{});
    }

    public FleksemClass(String wordClass) {
        this(wordClass, wordClass);
    }

    public void setGrammaticalCategory(GrammaticalCategory grammaticalCategory, String tagParts) {
        this.grammaticalCategories.interpretRules(grammaticalCategory, tagParts);
    }

    @Override
    public String getFleksem() {
        return this.fleksem;
    }

    @Override
    public String getWordClass() {
        return this.wordClass;
    }

    @Override
    public GrammaticalCategories getGrammaticalCategories() {
        return this.grammaticalCategories;
    }
}
