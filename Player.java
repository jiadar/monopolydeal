import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Player {
  static int instanceCounter = 1;

  private static HashMap<String, Integer> colorSets = new HashMap<String, Integer>();
  private static List<String> allColors;

  // A player has a hand of cards, and cards on the table
  private String name;
  private ArrayList<Card> playersHand;
  private ArrayList<Card> cardsOnTable;

  // At the start of a game, all players get 5 cards from the deck

  // Before each players turn, the player draws 2 cards from the deck.
  //
  // instance variables to hold the hand and cards on the table for each player
  // ANDY

  public Player(String name) {
    instanceCounter++;
    this.name = name;
    playersHand = new ArrayList<Card>();
    cardsOnTable = new ArrayList<Card>();
    colorSets.put("brown", 2);
    colorSets.put("blue", 2);
    colorSets.put("green", 3);
    colorSets.put("ltblue", 3);
    colorSets.put("orange", 3);
    colorSets.put("purple", 3);
    colorSets.put("black", 4);
    colorSets.put("red", 3);
    colorSets.put("ltgreen", 2);
    colorSets.put("yellow", 3);
    allColors =
        new ArrayList<String>(
            Arrays.asList(
                "brown", "blue", "green", "ltblue", "orange", "purple", "black", "red", "ltgreen",
                "yellow"));
  }

  public Player() {
    this("Player " + instanceCounter);
  }

  public String getName() {
    return name;
  }

  public int numCardsInHand() {
    return playersHand.size(); // go over
  }

  public ArrayList<Card> getHand() {
    return playersHand;
  }

  public void addCardToHand(Card c) {
    playersHand.add(c);
  }

  public Card getCardFromHand(int idx) {
    if (idx > playersHand.size()) {
      return null;
    }
    Card newCard = playersHand.get(idx);
    playersHand.remove(idx);
    return newCard;
  }

  public String cardNamesInHand() {
    String rval = "";
    for (int i = 0; i < playersHand.size(); i++) {
      Card newCardName = playersHand.get(i);
      rval += newCardName.getName();
      rval += "\n";
    }
    return rval;
  }

  public String cardNamesOnTable() {
    String rval = "";
    for (int i = 0; i < cardsOnTable.size(); i++) {
      Card newCardName = cardsOnTable.get(i);
      rval += newCardName.getName();
      rval += "\n";
    }
    return rval;
  }

  public Card playCardToTable(int idx) {
    Card otherCard = playersHand.get(idx);
    playersHand.remove(playersHand.get(idx));
    cardsOnTable.add(otherCard);
    return otherCard;
    // take a card at idx that is in the hand
    // remove the card from the hand
    // put the card on the table
    // return the card that was played
  }

  public int numCardsOnTableByColor(String color) {
    int count = 0;
    for (Card c : cardsOnTable) {
      String cardType = c.getType();
      boolean cardIsPropertyOrWild = (cardType == "Property") || (cardType == "Wild");
      if (cardIsPropertyOrWild && c.hasColor(color)) {
        count++;
      }
    }
    return count;
  }

  public int numPropertySets() {
    int numSets = 0;
    for (String color : allColors) {
      if (this.numCardsOnTableByColor(color) >= colorSets.get(color)) {
        numSets++;
      }
    }
    return numSets;
  }
}
