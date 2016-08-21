package com.example.result.partsOfSpeech;

import com.example.result.PartOfSpeech;

public class Noun implements PartOfSpeech {
    private String name;

    public Noun() {
        this.name = "Noun";
    }

    @Override
    public String getName() {
        return name;
    }
}
