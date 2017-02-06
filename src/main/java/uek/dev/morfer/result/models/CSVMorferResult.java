package uek.dev.morfer.result.models;

public class CSVMorferResult {
    private final static String header = "indexA, indexB, word, lemma, interpretation, additionalProperty";

    private String indexA;
    private String indexB;
    private String word;
    private String lemma;
    private String interpretation;
    private String additionalProperty;
    private String separator;

    public CSVMorferResult(String[] result, String separator) {
        this.separator = separator;
        this.indexA = result[MorferResultIndexes.INDEX_A.getIndex()];
        this.indexB = result[MorferResultIndexes.INDEX_B.getIndex()];
        this.word = result[MorferResultIndexes.WORD.getIndex()];
        this.lemma = result[MorferResultIndexes.LEMMA.getIndex()];
        this.interpretation = result[MorferResultIndexes.INTERPRETATION.getIndex()];
        int additionalPropertyIndex = MorferResultIndexes.ADDITIONAL_PROPERTY.getIndex();
        this.additionalProperty = "";

        int otherIndexes = additionalPropertyIndex - result.length;
        while (otherIndexes < 0) {
            this.additionalProperty += result[result.length + otherIndexes] + " ";
            otherIndexes++;
        }

        if(this.additionalProperty.length() < 1) {
            this.additionalProperty = "brak";
        }
    }

    public static String getHeader() {
        return header;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(indexA).append(separator).append(indexB).append(separator).append(word).append(separator)
                .append(lemma).append(separator).append(interpretation).append(separator).append(additionalProperty).toString();
    }
}
