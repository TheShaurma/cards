package logic.cards;

import java.util.ArrayList;

/**
 * Class of cards deck for game.
 */
public class CardDeck {
    private ArrayList<Card> cardsList;

    /**
     * From creating all Decks have all existing cards.
     */
    public CardDeck() {
        cardsList = CardsGenerator.getCardsList();
    }

    /**
     * 
     * @return
     */
    public Card takeCard() {
        // TODO: stub
        return new Card(null, null);
    }

    @Override
    public String toString() {
        String result = "CardDeck(\n";
        for (Card card : cardsList) {
            result += "  " + card + ";\n";
        }
        result += ")";

        return result;
    }
}

class CardsGenerator {
    public static ArrayList<Card> getCardsList() {
        ArrayList<Card> result = new ArrayList<>();

        for (Suits suit : Suits.values()) {
            for (ValuesFrom6 value : ValuesFrom6.values()) {
                Card card = new Card(suit, value);
                result.add(card);
            }
        }

        return result;
    }
}
