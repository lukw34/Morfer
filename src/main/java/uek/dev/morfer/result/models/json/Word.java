package uek.dev.morfer.result.models.json;


import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Tag> tags;

    public Word(String word) {
        this.word = word;
        tags = new ArrayList<>();
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public String getText() {
        return word;
    }

    public void setText(String text) {
        this.word = text;
    }
}
