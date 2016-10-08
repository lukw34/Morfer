package com.example.result;


import com.example.result.partsOfSpeech.PartOfSpeech;

public interface PartOfSpeechCreator {
    PartOfSpeech createPartOfSpeech(String interpretations);
}