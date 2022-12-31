package logic.cards;

public class Card {
    private final Suits suit;
    private final ValuesFrom6 value;
    private final boolean trump;

    public Card(Suits suit, ValuesFrom6 value) {
        this.suit = suit;
        this.value = value;
        trump = false;
    }

    public Card(Suits suit, ValuesFrom6 value, boolean trump) {
        this.suit = suit;
        this.value = value;
        this.trump = trump;
    }

    public boolean canBeat(Card card) {
        if (!isTrump() && card.isTrump()) {
            return false;
        } else if (isTrump() && !card.isTrump()) {
            return true;
        }

        int ownPower = getValue().getIntValue();
        int otherPower = card.getValue().getIntValue();
        Suits ownSuit = getSuit();
        Suits otherSuit = card.getSuit();

        return ownPower > otherPower && ownSuit == otherSuit;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public ValuesFrom6 getValue() {
        return this.value;
    }

    public boolean isTrump() {
        return this.trump;
    }

    @Override
    public String toString() {
        return "Card(" + getSuit() + ", " + getValue() + ")";
    }
}
