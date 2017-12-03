package uek.dev.morfer.result.models.json;


import java.util.ArrayList;

public class Segment {
    private String segment;
    private String position;
    private ArrayList<Interpretation> interpretations;

    public Segment(String segment, String position) {
        this.segment = segment;
        this.position = position;
        interpretations = new ArrayList<>();
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Interpretation> getInterpretations() {
        return interpretations;
    }

    public void setInterpretations(ArrayList<Interpretation> interpretations) {
        this.interpretations = interpretations;
    }
}
