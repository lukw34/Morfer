package com.example.Result.PartsOfSpeech;

import com.example.Result.PartOfSpeech;

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
