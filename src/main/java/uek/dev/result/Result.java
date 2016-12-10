package uek.dev.result;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import uek.dev.morpheus.Morpheus;
import uek.dev.sample.Sample;
import uek.dev.sample.SampleNotFoundException;

import java.util.ArrayList;

public class Result {

    private static Long counter = 1L;

    @Id
    @Field("id")
    private long  id;

    @Field
    private ArrayList<Word> interpretations;

    public Result() {}

    public Result(Sample sample) throws SampleNotFoundException {
        if(sample.getSample() == null) {
            throw new SampleNotFoundException();
        }
        id = counter;
        counter ++;
        this.interpretations = Morpheus.getResult(sample);
    }

    public long getId() {
        return id;
    }

    public ArrayList<Word> getInterpretations() {
        return interpretations;
    }

    public void setInterpretations(ArrayList<Word> interpretations) {
        this.interpretations = interpretations;
    }
}
