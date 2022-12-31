package logic.cards;

public enum Suits {
    SPADES,
    CLUBS,
    DIAMONDS,
    HEARTS;

    @Override
    public String toString() {
        if (this == SPADES) {
            return "Spades";
        } else if (this == CLUBS) {
            return "Clubs";
        } else if (this == DIAMONDS) {
            return "Diamonds";
        } else { // if (this == HEARTS) {
            return "Hearts";
        }
    }
}
