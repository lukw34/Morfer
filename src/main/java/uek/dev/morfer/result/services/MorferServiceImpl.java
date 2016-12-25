package uek.dev.morfer.result.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sgjp.morfeusz.ResultsIterator;
import uek.dev.morfer.result.models.MorferResultIndexes;
import uek.dev.morfer.result.models.json.Tag;
import uek.dev.morfer.result.models.json.Word;
import uek.dev.morpheus.Morpheus;

import java.util.ArrayList;

@Service("morferService")
@Transactional
public class MorferServiceImpl implements MorferService {

    @Override
    public ArrayList<Word> createModel(String sample) {
        int counter = -1;
        ArrayList<Word> morferResult = new ArrayList<>();
        ArrayList<Tag> actualTagsList = new ArrayList<>();
        ArrayList<String> lines = getMorferResult(sample);

        for (String line : lines) {
            String[] columns = line.split(" ");
            int wordCounter = Integer.parseInt(columns[MorferResultIndexes.INDEX_A.getIndex()]);

            if (wordCounter != counter) {
                counter = wordCounter;
                morferResult.add(wordCounter, new Word(columns[MorferResultIndexes.WORD.getIndex()]));
                actualTagsList = morferResult.get(wordCounter).getTags();
            }

            String lemma = columns[MorferResultIndexes.LEMMA.getIndex()];
            String interpretation = columns[MorferResultIndexes.INTERPRETATION.getIndex()];
            actualTagsList.add(new Tag(interpretation, lemma));
        }

        return morferResult;
    }

    @Override
    public ArrayList<String> getMorferResult(String sample) {
        ArrayList<String> result = new ArrayList<>();
        ResultsIterator resultsIterator = Morpheus.getResultIterator(sample);
        resultsIterator.forEachRemaining(next -> result.add(Morpheus.getInterpretations(next)));
        return result;
    }
}