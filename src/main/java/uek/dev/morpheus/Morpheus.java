package uek.dev.morpheus;


import pl.sgjp.morfeusz.Morfeusz;
import pl.sgjp.morfeusz.MorfeuszUsage;
import pl.sgjp.morfeusz.MorphInterpretation;
import pl.sgjp.morfeusz.ResultsIterator;
import pl.sgjp.morfeusz.app.MorfeuszUtils;

public class Morpheus {

    private static Morfeusz morpheusInstance = Morfeusz.createInstance(MorfeuszUsage.ANALYSE_ONLY);

    public static ResultsIterator getResultIterator(String  sample) {
        return morpheusInstance.analyseAsIterator(sample);
    }

    public static String getInterpretations(ResultsIterator iterator) {
        return MorfeuszUtils.getInterpretationString(iterator.next(), morpheusInstance);
    }

    public static String getInterpretations(MorphInterpretation interpretation) {
        return MorfeuszUtils.getInterpretationString(interpretation, morpheusInstance);
    }
}
