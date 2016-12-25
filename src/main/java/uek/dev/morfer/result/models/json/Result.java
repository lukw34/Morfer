package uek.dev.morfer.result.models.json;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    private ArrayList<Word> interpretations;

    public Result() {}

    public Result(ArrayList<Word> interpretations) {
        this.interpretations = interpretations;
    }

    public ArrayList<Word> getInterpretations() {
        return interpretations;
    }
}
