import java.util.ArrayList;

public class Deck {
  ArrayList<Card> deck = new ArrayList<Card>();

  public Deck() {
    // Creat a monopoly deal deck by creating each card and adding the card to the deck
    // See http://monopolydealrules.com/index.php?page=cards

    // ACTION CARDS - 34 vs 36

    // 2 Deal Breaker

    deck.add(new ActionCard("Deal breaker", "Take a full set from your opponent", 5));
    deck.add(new ActionCard("Deal breaker", "Take a full set from your opponent", 5));

    //  3 Debt Collector
    deck.add(new ActionCard("Debt Collector", "Take 5M from one opponent", 3));
    deck.add(new ActionCard("Debt Collector", "Take 5M from one opponent", 3));
    deck.add(new ActionCard("Debt Collector", "Take 5M from one opponent", 3));

    // 2 Double The Rent Cards
    deck.add(new ActionCard("Double Rent", "Double the rent owed", 1));
    deck.add(new ActionCard("Double Rent", "Double the rent owed", 1));

    // 4 Force Deal
    deck.add(new ActionCard("Forced Deal", "Swap your property with another player's property", 3));
    deck.add(new ActionCard("Forced Deal", "Swap your property with another player's property", 3));
    deck.add(new ActionCard("Forced Deal", "Swap your property with another player's property", 3));
    deck.add(new ActionCard("Forced Deal", "Swap your property with another player's property", 3));

    // 3 Hotel
    deck.add(new ActionCard("Hotel"," Add onto any full set you own to add $4M to rent, excludes railroad & utilities", 4));
    deck.add(new ActionCard("Hotel"," Add onto any full set you own to add $4M to rent, excludes railroad & utilities", 4));
    deck.add(new ActionCard("Hotel"," Add onto any full set you own to add $4M to rent, excludes railroad & utilities", 4));

    // 3 House
    deck.add(new ActionCard("House", "Add onto any full set you own to add $3M to rent, excludes railroad & utilities", 3));
    deck.add(new ActionCard("House", "Add onto any full set you own to add $3M to rent, excludes railroad & utilities", 3));
    deck.add(new ActionCard("House", "Add onto any full set you own to add $3M to rent, excludes railroad & utilities", 3));

    // 3 It’s My Birthday
    deck.add(new ActionCard("It's My Birthday", "All players gift 2M to you", 2));
    deck.add(new ActionCard("It's My Birthday", "All players gift 2M to you", 2));
    deck.add(new ActionCard("It's My Birthday", "All players gift 2M to you", 2));
    
    // 3 Just Say No
    deck.add(new ActionCard("Just Say No!", "Use anytime a card is played against you", 4));
    deck.add(new ActionCard("Just Say No!", "Use anytime a card is played against you", 4));
    deck.add(new ActionCard("Just Say No!", "Use anytime a card is played against you", 4));

    // 10 Pass Go
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));
    deck.add(new ActionCard("Pass Go", "Draw an extra 2 cards", 1));

    // 3 Sly Deal
    deck.add(new ActionCard("Sly Deal", "Steal a property from a player of your choice, cannot be part of full set",3));
    deck.add(new ActionCard("Sly Deal", "Steal a property from a player of your choice, cannot be part of full set",3));
    deck.add(new ActionCard("Sly Deal", "Steal a property from a player of your choice, cannot be part of full set",3));

    // PROPERTY CARDS - 28 ok
    deck.add(new PropertyCard("Baltic", "Baltic Ave", 1, "brown"));
    deck.add(new PropertyCard("Mediterrain", "Mediterrain Ave", 1, "brown"));
    deck.add(new PropertyCard("Boardwalk", "BoardWalk", 4, "blue"));
    deck.add(new PropertyCard("Park", "Park Place", 4, "blue"));
    deck.add(new PropertyCard("Carolina", "North Carolina Ave", 4, "green"));
    deck.add(new PropertyCard("Pacific", "Pacific Ave", 4, "green"));
    deck.add(new PropertyCard("Pennsylvania", "Pennsylvania Ave", 4, "green"));
    deck.add(new PropertyCard("Connecticut", "Connecticut Ave", 1, "ltblue"));
    deck.add(new PropertyCard("Oriental", "Oriental Ave", 1, "ltblue"));
    deck.add(new PropertyCard("Vermont", "Vermont Ave", 1, "ltblue"));
    deck.add(new PropertyCard("New York", "New York Ave", 2, "orange"));
    deck.add(new PropertyCard("St. James", "St. James Place", 2, "orange"));
    deck.add(new PropertyCard("Tennessee", "Tennessee Ave", 2, "orange"));
    deck.add(new PropertyCard("St. Chales", "St. Charles Place", 2, "purple"));
    deck.add(new PropertyCard("Virginia", "Virginia Ave", 2, "purple"));
    deck.add(new PropertyCard("States", "States Ave", 2, "purple"));
    deck.add(new PropertyCard("Short", "Short Line", 2, "black"));
    deck.add(new PropertyCard("B. & O.", "B. & O.", 2, "black"));
    deck.add(new PropertyCard("Reading", "Reading Railroad", 2, "black"));
    deck.add(new PropertyCard("Pennsylvania", "Pennsylvania Railroad", 2, "black"));
    deck.add(new PropertyCard("Kentucky", "Kentucky Ave", 3, "red"));
    deck.add(new PropertyCard("Indiana", "Indiana Ave", 3, "red"));
    deck.add(new PropertyCard("Illinois", "Illinois Ave", 3, "red"));
    deck.add(new PropertyCard("Water", "Water Works", 2, "ltgreen"));
    deck.add(new PropertyCard("Electric", "Electric Company", 2, "ltgreen"));
    deck.add(new PropertyCard("Ventnor", "Ventnor Ave", 3, "yellow"));
    deck.add(new PropertyCard("Marvin", "Marvin Gardens", 3, "yellow"));
    deck.add(new PropertyCard("Atlantic", "Atlantic Ave", 3, "yellow"));


    // MONEY CARDS
    deck.add(new MoneyCard("10M", "10 million", 10));
    deck.add(new MoneyCard("1M", "$1 million", 1));
    deck.add(new MoneyCard("1M", "$1 million", 1));
    deck.add(new MoneyCard("1M", "$1 million", 1));
    deck.add(new MoneyCard("1M", "$1 million", 1));
    deck.add(new MoneyCard("1M", "$1 million", 1));
    deck.add(new MoneyCard("1M", "$1 million", 1));

    deck.add(new MoneyCard("2M", "$2 million", 2));
    deck.add(new MoneyCard("2M", "$2 million", 2));
    deck.add(new MoneyCard("2M", "$2 million", 2));
    deck.add(new MoneyCard("2M", "$2 million", 2));
    deck.add(new MoneyCard("2M", "$2 million", 2));

    deck.add(new MoneyCard("3M", "$3 million", 3));
    deck.add(new MoneyCard("3M", "$3 million", 3));
    deck.add(new MoneyCard("3M", "$3 million", 3));

    deck.add(new MoneyCard("4M", "$4 million", 4));
    deck.add(new MoneyCard("4M", "$4 million", 4));
    deck.add(new MoneyCard("4M", "$4 million", 4));
 
    deck.add(new MoneyCard("5M", "$5 million", 5));
    deck.add(new MoneyCard("5M", "$5 million", 5));

    // RENT CARDS
    RentCard w = new RentCard("Wild Rent Card", "Charge rent on any property", 3);
    w.addColor("brown");
    w.addColor("blue");
    w.addColor("green");
    w.addColor("ltblue");
    w.addColor("orange");
    w.addColor("purple");
    w.addColor("black");
    w.addColor("red");
    w.addColor("ltgreen");
    w.addColor("yellow");
    deck.add(w);
    deck.add(w);
    deck.add(w);

    w = new RentCard("Green / Blue", "Charge rent on green or blue property", 1);
    w.addColor("brown");
    w.addColor("ltblue");
    deck.add(w);
    deck.add(w);

    w = new RentCard("Railroad / Utility", "Charge rent on Railroad or utility property", 1);
    w.addColor("black");
    w.addColor("ltgreen");
    deck.add(w);
    deck.add(w);

    w = new RentCard("Orange / Purple", "Charge rent on orange or purple property", 1);
    w.addColor("orange");
    w.addColor("purple");
    deck.add(w);
    deck.add(w);
    
    w = new RentCard("Brown / Light Blue", "Charge rent on brown or light blue property", 1);
    w.addColor("brown");
    w.addColor("ltblue");
    deck.add(w);
    deck.add(w);

    w = new RentCard("Red / Yellow", "Charge rent on red or yellow property", 1);
    w.addColor("red");
    w.addColor("yellow");
    deck.add(w);
    deck.add(w);

    // WILD CARDS - 11

    WildCard wildcard1 = new WildCard("blue/green Wild Card", "Use with blue/green properties", 4);
    wildcard1.addColor("blue");
    wildcard1.addColor("green");
    deck.add(wildcard1);

    WildCard wildcard2 = new WildCard("ltblue/brown Wild Card", "Use with ltblue/brown properties", 1);
    wildcard2.addColor("ltblue");
    wildcard2.addColor("brown");
    deck.add(wildcard2);
    
    WildCard wildcard3 = new WildCard("brown/blue/green/ltblue/orange/purple/black/red/ltgreen/yellow Wild Card", "Use with brown/blue/green/ltblue/orange/purple/black/red/ltgreen/yellow properties", 0);
    wildcard3.addColor("brown");
    wildcard3.addColor("blue");
    wildcard3.addColor("green");
    wildcard3.addColor("ltblue");
    wildcard3.addColor("orange");
    wildcard3.addColor("purple");
    wildcard3.addColor("black");
    wildcard3.addColor("red");
    wildcard3.addColor("ltgreen");
    wildcard3.addColor("yellow");
    deck.add(wildcard3);
    deck.add(wildcard3);

    WildCard wildcard4 = new WildCard("orange/purple Wild Card", "Use with orange/purple properties", 2);
    wildcard4.addColor("orange");
    wildcard4.addColor("purple");
    deck.add(wildcard4);
    deck.add(wildcard4);
    
    WildCard wildcard5 = new WildCard("green/black Wild Card", "Use with green/black properties", 4);
    wildcard5.addColor("green");
    wildcard5.addColor("black");
    deck.add(wildcard5);
    
    WildCard wildcard6 = new WildCard("ltblue/black Wild Card", "Use with ltblue/black properties", 4);
    wildcard6.addColor("ltblue");
    wildcard6.addColor("black");
    deck.add(wildcard6);
    
    WildCard wildcard7 = new WildCard("ltgreen/black Wild Card", "Use with ltgreen/black properties", 2);
    wildcard7.addColor("ltgreen");
    wildcard7.addColor("black");
    deck.add(wildcard7);
    
    WildCard wildcard8 = new WildCard("yellow/red Wild Card", "Use with yellow/red properties", 3);
    wildcard8.addColor("yellow");
    wildcard8.addColor("red");
    deck.add(wildcard8);
    deck.add(wildcard8);

  }
  public int numCardsInDeck() {
    return this.deck.size();
  }

  public int[] order() {
    int[] lexOrder = new int[108];
    // andy to write
    return lexOrder;
  }

  public String toString() {
    String rval = "";
    for (Card card : deck) {
      rval += card.toString() + "\n";
    }
    return rval;
  }
}
