package uek.dev.morfer.result.services;

import uek.dev.morfer.result.models.json.Segment;

import java.util.ArrayList;

public interface MorferService {
    ArrayList<Segment> createModel(String sample);
    ArrayList<String> getMorferResult(String sample);
}
