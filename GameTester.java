import java.util.ArrayList;

class GameTester{

  public static void main(String[] args){
      Player andrew  = new Player();
      Player javin = new Player();
      System.out.println(andrew.getName());
      System.out.println(javin.getName());

      Deck newDeck = new Deck();
      newDeck.shuffle();
      // loop
        
      while(andrew.getHand().size() < 5){
        Card c = newDeck.draw();
        andrew.addCardToHand(c); 
      }

      System.out.println(andrew.cardNamesInHand());

      //andrew.discardFromHand(7);

      System.out.println(andrew.cardNamesInHand());

      // Test for num property sets
      andrew.addCardToHand(new PropertyCard("Baltic", "Baltic Ave", 1, "brown"));
      andrew.addCardToHand(new PropertyCard("Mediterrain", "Mediterrain Ave", 1, "brown"));

      andrew.addCardToHand(new PropertyCard("Connecticut", "Connecticut Ave", 1, "ltblue"));
      andrew.addCardToHand(new PropertyCard("Oriental", "Oriental Ave", 1, "ltblue"));
      andrew.addCardToHand(new PropertyCard("Vermont", "Vermont Ave", 1, "ltblue"));

      System.out.println("Cards in Hand: ");
      System.out.println(andrew.cardNamesInHand());

      andrew.playCardToTable(5);
      andrew.playCardToTable(5);
      andrew.playCardToTable(5);
      andrew.playCardToTable(5);
      andrew.playCardToTable(5);

      System.out.println("Cards on table: ");
      System.out.println(andrew.cardNamesOnTable());

      System.out.println(andrew.numCardsOnTableByColor("brown"); // Should print 2
      System.out.println(andrew.numCardsOnTableByColor("ltblue"); // Should print 3

      System.out.println(andrew.numPropertySets()); // Should print 2 
      
    }
}