package logic.cards;

public interface CardDeck {
    /**
     * Return card and remove it from deck.
     * 
     * @return card from deck.
     */
    Card takeCard();

    /**
     * @return card which will be taken past.
     */
    Card getLastCard();
}
