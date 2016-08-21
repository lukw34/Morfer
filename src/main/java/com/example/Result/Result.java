package com.example.Result;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Generated;
import java.util.ArrayList;

public class Result {

/*    @Id
    private Long id;*/

    @Field
    private String word;
    @Field
    private ArrayList<Tag> tags;

    public Result(String word) {
        this.word = word;
//        this.tags = tags;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
