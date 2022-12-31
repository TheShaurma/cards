package logic.cards;

public interface Card {
    boolean canBeat(Card card);

    Suits getSuit();

    ValuesFrom6 getValue();

    boolean isTrump();
}
