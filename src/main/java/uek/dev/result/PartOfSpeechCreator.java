package uek.dev.result;


import uek.dev.result.partsOfSpeech.PartOfSpeech;

public interface PartOfSpeechCreator {
    PartOfSpeech createPartOfSpeech(String interpretations);
}