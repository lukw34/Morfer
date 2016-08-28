package com.example.result.partsOfSpeech;


public class Preposition implements PartOfSpeech{
    private String name;

    public Preposition(String interpretation) {
        this.name = "Preposition";
    }

    @Override
    public String getName() {
        return name;
    }
}
