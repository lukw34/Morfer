package uek.dev.morfer.result.models;

public class CSVMorferResult {
    private final static String  header = "indexA, indexB, word, lemma, interpretation, additionalProperty";

    private String  indexA;
    private String  indexB;
    private String word;
    private String lemma;
    private String interpretation;
    private String additionalProperty;

    public CSVMorferResult(String[] result) {
        this.indexA = result[MorferResultIndexes.INDEX_A.getIndex()];
        this.indexB = result[MorferResultIndexes.INDEX_B.getIndex()];
        this.word = result[MorferResultIndexes.WORD.getIndex()];
        this.lemma = result[MorferResultIndexes.LEMMA.getIndex()];
        this.interpretation = result[MorferResultIndexes.INTERPRETATION.getIndex()];
        int additionalPropertyIndex = MorferResultIndexes.ADDITIONAL_PROPERTY.getIndex();
        this.additionalProperty = "brak";

        if(result.length > additionalPropertyIndex) {
            this.additionalProperty = result[additionalPropertyIndex];
        }
    }

    public static String getHeader() {
        return header;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(indexA).append(",").append(indexB).append(",").append(word).append(",")
                .append(lemma).append(",").append(interpretation).append(",").append(additionalProperty).toString();
    }
}
