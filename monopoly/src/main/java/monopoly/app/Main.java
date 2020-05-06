package monopoly.app;
import java.util.Scanner;
/** Hello world! */
public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Monopoly Deal");
    Scanner sc = new Scanner(System.in);
    // [1] = a message for player 1 only
    // {1} = an input request for player 1
    // [2] = a message for player 2 only
    // {2} = an input request for player 2
    // [A] = a message for all players

    System.out.print("[1] What is your name? ");
    String name = sc.nextLine();
    System.out.println("Hello, and thank you for playing Monopoly, " + name + "!");

    System.out.print("[2] What is your name? ");
    String name_2 = sc.nextLine();
    System.out.println("Hello, and thank you for playing Monopoly, " + name_2 + "!");

    // Set it to be player1's turn

    String playersTurn = name;
    
    
    // Start a new game
    // make 2 players 
    
    Game g = new Game();
    Player newPlayer = new Player(name);
    Player newPlayer_1 = new Player(name_2);
    g.addPlayer(newPlayer);
    g.addPlayer(newPlayer_2);

    // Player 1 is delt two new cards
    // Display the cards in hand and cards on table for player 1
    // Display the number of full sets and the money on the table including dominiations for Player1
    // Player 1 chooses up to 3 actions from the below sequence
    // - Optionally set color for any wild cards, then
    // - Play a card from the hand
    //   either an action to the discard pile or a property/wild/money to the table)
    //   If the player charges rent via an action card, the player can take money cards
    //   or property cards from the other player to satisfy the rent
    // - Pass / end turn
    //
    // Check if player1 has met winning condition (Has 3 full property sets)
    // At the conclusion of Player1's turn, then Player2 has a turn and goes through
    // the actions above
  }
}
