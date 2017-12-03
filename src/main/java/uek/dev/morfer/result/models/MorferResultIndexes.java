package uek.dev.morfer.result.models;

public enum MorferResultIndexes {
    INDEX_A(0),
    INDEX_B(1),
    WORD(2),
    LEMMA(3),
    TAGS(4),
    ADDITIONAL_PROPERTY(5);

    private final int index;

    MorferResultIndexes(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
