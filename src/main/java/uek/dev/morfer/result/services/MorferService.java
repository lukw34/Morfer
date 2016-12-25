package uek.dev.morfer.result.services;

import uek.dev.morfer.result.models.json.Word;

import java.util.ArrayList;

public interface MorferService {
    ArrayList<Word> createModel(String sample);
    ArrayList<String> getMorferResult(String sample);
}
