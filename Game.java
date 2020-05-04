import java.util.ArrayList;
public class Game {
  // A game has 2 players, and a deck and act as a dealer
  // The game will have the following state: 
  // If the game has started
  // What players are in the game
  // What players turn it is
  // The game deck
  //
  // The game will have the following actions:
  // Add a player
  // A player could go bankrupt (remove)
  // A player wins the game
  // Accepting action cards or discard cards by players to the discard pile
  // Dealing cards from the deck to players
  
  boolean hasStarted = false;
  ArrayList<Player> whosPlaying= new ArrayList<Player>();
  int turn = 0;
  Deck newDeck = new Deck();

  public Game() {
    newDeck.shuffle();

  }

  public void addPlayer(Player p) {
    whosPlaying.add(p);
    for(int i = 0; i < 5; i++){
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
    if(turn < whosPlaying.size()){
        turn++;
        return;
    }
    turn = 0;
  }

  public void action() {
    Player currentPlayer = this.startTurn();
    currentPlayer.addCardToHand(newDeck.draw());
    currentPlayer.addCardToHand(newDeck.draw());

    Card cardInPlay = currentPlayer.getCardForAction();

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
    this.endTurn();
  }

}