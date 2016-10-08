package uek.dev.morpheus;


import pl.sgjp.morfeusz.Morfeusz;
import pl.sgjp.morfeusz.MorfeuszUsage;
import pl.sgjp.morfeusz.ResultsIterator;
import pl.sgjp.morfeusz.app.MorfeuszUtils;
import uek.dev.result.Tag;
import uek.dev.result.Word;
import uek.dev.sample.Sample;

import java.util.ArrayList;

public class Morpheus {

    private static Morfeusz morpheusInstance = Morfeusz.createInstance(MorfeuszUsage.ANALYSE_ONLY);

    public static ArrayList<Word> getResult(Sample sample) {
        ResultsIterator resultsIterator = morpheusInstance.analyseAsIterator(sample.getSentence());
        int counter = -1;
        ArrayList<Word> sentence = new ArrayList<>();
        ArrayList<Tag> actualTagsList = new ArrayList<>();

        while (resultsIterator.hasNext()) {
            String[] column = MorfeuszUtils.getInterpretationString(resultsIterator.next(), morpheusInstance).split(" ");

            int wordCounter = Integer.parseInt(column[0]);

            if (wordCounter != counter) {
                counter = wordCounter;
                sentence.add(wordCounter, new Word(column[2]));
                actualTagsList = sentence.get(wordCounter).getTags();
            }

            String lemma = column[3];
            String interpretation = column[4];
            actualTagsList.add(new Tag(interpretation, lemma));
        }

        return sentence;
    }
}
