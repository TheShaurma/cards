package logic.cards;

public enum ValuesFrom6 {
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;

    public int getIntValue() {
        if (this == SIX) {
            return 6;
        } else if (this == SEVEN) {
            return 7;
        } else if (this == EIGHT) {
            return 8;
        } else if (this == NINE) {
            return 9;
        } else if (this == TEN) {
            return 10;
        } else if (this == JACK) {
            return 11;
        } else if (this == QUEEN) {
            return 12;
        } else if (this == KING) {
            return 13;
        } else { // if (this == ACE) {
            return 14;
        }
    }

    @Override
    public String toString() {
        if (this == SIX) {
            return "6";
        } else if (this == SEVEN) {
            return "7";
        } else if (this == EIGHT) {
            return "8";
        } else if (this == NINE) {
            return "9";
        } else if (this == TEN) {
            return "10";
        } else if (this == JACK) {
            return "Jack";
        } else if (this == QUEEN) {
            return "Queen";
        } else if (this == KING) {
            return "King";
        } else { // if (this == ACE) {
            return "Ace";
        }
    }
}
