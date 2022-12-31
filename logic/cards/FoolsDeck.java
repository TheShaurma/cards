package logic.cards;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class of cards deck for game.
 */
public class FoolsDeck implements CardDeck {
    private ArrayList<Card> cardsList;
    private final Card lastCard;

    /**
     * From creating all Decks have all existing cards.
     */
    public FoolsDeck() {
        cardsList = CardsGenerator.getCardsList();
        Collections.shuffle(cardsList);

        lastCard = cardsList.get(cardsList.size() - 1);
    }

    public Card takeCard() {
        Card result = cardsList.get(0);
        cardsList.remove(0);

        return result;
    }

    @Override
    public Card getLastCard() {
        return lastCard;
    }

    @Override
    public String toString() {
        String result = "FoolsDeck(\n";

        result += "  Count: " + cardsList.size() + ";\n";
        result += "  Next: " + cardsList.get(0) + ";\n";
        result += "  Last: " + getLastCard() + ";\n";

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
                Card card = new FoolsCard(suit, value);
                result.add(card);
            }
        }

        return result;
    }
}
