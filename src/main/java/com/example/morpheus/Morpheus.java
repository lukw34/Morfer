package com.example.morpheus;


import com.example.result.Word;
import com.example.sample.Sample;
import pl.sgjp.morfeusz.Morfeusz;
import pl.sgjp.morfeusz.MorfeuszUsage;
import pl.sgjp.morfeusz.ResultsIterator;
import pl.sgjp.morfeusz.app.MorfeuszUtils;

import java.util.ArrayList;

public class Morpheus {

    private static  Morfeusz morpheusInstance = Morfeusz.createInstance(MorfeuszUsage.ANALYSE_ONLY);

    public static ArrayList<Word> getResult(Sample sample) {
        ResultsIterator resultsIterator = morpheusInstance.analyseAsIterator(sample.getSentence());
        int counter = 0;
        ArrayList<Word> sentence = new ArrayList<>();

        while(resultsIterator.hasNext()) {
            String[] line = MorfeuszUtils.getInterpretationString(resultsIterator.next(), morpheusInstance).split(" ");
            int wordCounter = Integer.parseInt(line[1]);

            if(wordCounter != counter) {
                counter = wordCounter;
                sentence.add(new Word(line[2]));
            }

        }

        return sentence;
    }
}
