
import java.util.ArrayList;

import sun.tools.jar.resources.jar;

public class Player {
  static int instanceCounter = 1;
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
    if(idx > playersHand.size()){
      return null;
    }
    Card newCard = playersHand.get(idx);
    playersHand.remove(idx);
    return newCard;
  }

  public String cardNamesInHand() {
    String rval = "";
    for(int i = 0; i < playersHand.size(); i++){
      Card newCardName = playersHand.get(i);
      rval += newCardName.getName();
      rval += "\n";
    }
    return rval;
  }
  
  public String cardNamesOnTable() {
    String rval = "";
    for(int i = 0; i < cardsOnTable.size(); i++){
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
    // Assume this exists
    // Keep a counter starting at 0
    // Loop through cardsOnTable
    // If the card has color color, then increment counter
    // // NOTE: the color is an array itself, so you will have another
    // // loop through the color array to check the color
    // Return the counter
  }

  // TODO
  public int numPropertySets() {
    // check if numCardsOnTableByColor("brown") == 2 then increment numPropertySets
    // check if numCardsOnTableByColor("ltblue") == 3 then increment numPropertySets
    // ...
    // ...

    // return the number of complete property sets on the players table
    return 0;
  }

}