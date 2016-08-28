package com.example.result.partsOfSpeech;

import com.example.result.PartOfSpeechCreator;

public class Substantive implements PartOfSpeech{
    private String name;

    public Substantive(String interpretations) {
        this.name = "Substantive";
    }

    @Override
    public String getName() {
        return name;
    }
}
