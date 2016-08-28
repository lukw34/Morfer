package com.example.result.partsOfSpeech;


public class Conjuction implements PartOfSpeech{
    private String name;

    public Conjuction(String interpretation) {
        this.name = "Conjuction";
    }

    @Override
    public String getName() {
        return name;
    }
}
