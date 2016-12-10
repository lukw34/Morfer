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
        ResultsIterator resultsIterator = morpheusInstance.analyseAsIterator(sample.getSample());
        int counter = -1;
        ArrayList<Word> morferResult = new ArrayList<>();
        ArrayList<Tag> actualTagsList = new ArrayList<>();

        while (resultsIterator.hasNext()) {
            String result = MorfeuszUtils.getInterpretationString(resultsIterator.next(), morpheusInstance);
            System.out.println(result);
            String[] column = result.split(" ");

            int wordCounter = Integer.parseInt(column[0]);

            if (wordCounter != counter) {
                counter = wordCounter;
                morferResult.add(wordCounter, new Word(column[2]));
                actualTagsList = morferResult.get(wordCounter).getTags();
            }

            String lemma = column[3];
            String interpretation = column[4];
            actualTagsList.add(new Tag(interpretation, lemma));
        }

        return morferResult;
    }
}
