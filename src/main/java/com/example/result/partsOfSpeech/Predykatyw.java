package com.example.result.partsOfSpeech;


public class Predykatyw implements PartOfSpeech{
    private String name;

    public Predykatyw(String interpretation) {
        this.name = "Predykatyw";
    }

    @Override
    public String getName() {
        return name;
    }
}
