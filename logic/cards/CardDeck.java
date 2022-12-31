package logic.cards;

import java.util.ArrayList;
import java.util.Collections;

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
        Collections.shuffle(cardsList);
    }

    /**
     * Return card and remove it from deck.
     * 
     * @return card from deck.
     */
    public Card takeCard() {
        Card result = cardsList.get(0);
        cardsList.remove(0);

        return result;
    }

    @Override
    public String toString() {
        String result = "CardDeck(\n";
        result += "  Count: " + cardsList.size() + ";\n";
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
