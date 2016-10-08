package com.example.result;


import com.example.morpheus.Morpheus;
import com.example.sample.Sample;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.Generated;
import java.util.ArrayList;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Result {

    private static Long counter = 1L;

    @Id
    @Field("id")
    private long  id;

    @Field
    private ArrayList<Word> interpretations;

    @Field
    private String sentence;

    Result(Sample sample) {
        id = counter;
        counter ++;
        this.sentence = sample.getSentence();
        this.interpretations = Morpheus.getResult(sample);
    }

    public long getId() {
        return id;
    }

    public ArrayList<Word> getInterpretations() {
        return interpretations;
    }

    public void setInterpretations(ArrayList<Word> interpretations) {
        this.interpretations = interpretations;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
