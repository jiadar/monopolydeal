package monopoly.app;

import java.util.ArrayList;

public class Game {
  //

  private boolean hasStarted = false;
  private ArrayList<Player> whosPlaying = new ArrayList<Player>();
  private int turn = 0;
  private Deck newDeck = new Deck();

  public Game() {
    newDeck.shuffle();
  }

  public void addPlayer(Player p) {
    whosPlaying.add(p);
    for (int i = 0; i < 5; i++) {
      p.addCardToHand(newDeck.draw());
    }
  }

  public void startGame() {
    hasStarted = true;
  }

  public boolean isGameStarted() {
    return hasStarted;
  }

  public Player startTurn() {
    return whosPlaying.get(turn);
  }

  public void endTurn() {
    // If the player has more than 7 cards at the end of their turn, they need
    // to discard half of their cards (round down, so if you have 9 in your hand,
    // discard 4)
    if (turn < whosPlaying.size()) {
      turn++;
      return;
    }
    turn = 0;
  }

  public void action() {
    Player currentPlayer = this.startTurn();
    currentPlayer.addCardToHand(newDeck.draw());
    currentPlayer.addCardToHand(newDeck.draw());

    /*     Card cardInPlay = currentPlayer.g();

       int currentPlay = 0;
       while (currentPlay < 3) {
         if (cardInPlay == null) {
           // end the turn , and return
         }
         // ask the card played what type of card it is
         String cardType = cardInPlay.getType();
         if(cardType == "RentCard" || cardType == "ActionCard") {
             // cause the effect of the card
             // put it in the discard pile
         }
         // if it is a normal card, put it on the table
         currentPlay++;
       }
    */ this.endTurn();
  }
}
