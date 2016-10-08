package uek.dev.result;


import java.util.ArrayList;

public class Word {
    private String text;
    private ArrayList<Tag> tags;

    public Word(String text) {
        this.text = text;
        tags = new ArrayList<>();
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
