import java.util.ArrayList;

public class Deck {
  ArrayList<Card> deck = new ArrayList<Card>();

  public Deck() {
    // Creat a monopoly deal deck by creating each card and adding the card to the deck
    // See http://monopolydealrules.com/index.php?page=cards

    // ACTION CARDS
    deck.add(new ActionCard("Deal breaker", "Take a full set from your opponent", 5));
    deck.add(new ActionCard("Debt Collector", "Take 5M from one opponent", 3));
    // andy to add the rest

    // PROPERTY CARDS
    deck.add(new PropertyCard("Baltic", "Baltic Ave", 1, "brown"));
    deck.add(new PropertyCard("Mediterrain", "Mediterrain Ave", 1, "brown"));
    // andy to add the rest

    // MONEY CARDS
    deck.add(new MoneyCard("10M", "10 million", 10));
    // andy to add the rest

    // RENT CARDS
    // andy to add the rent cards

    // WILD CARDS
    // andy to add the wild cards
  }

  public int numCardsInDeck() {
    return this.deck.size();
  }

  public String toString() {
    String rval = "";
    for (Card card : deck) {
      rval += card.toString() + "\n";
    }
    return rval;
  }
}
