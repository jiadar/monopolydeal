class GameTester {

  private static Card getCard(String type) {
    if (type == "all wild") {
      WildCard wildcard3a =
          new WildCard(
              "brown/blue/green/ltblue/orange/purple/black/red/ltgreen/yellow Wild Card",
              "Use with brown/blue/green/ltblue/orange/purple/black/red/ltgreen/yellow properties",
              0);
      wildcard3a.addColor("brown");
      wildcard3a.addColor("blue");
      wildcard3a.addColor("green");
      wildcard3a.addColor("ltblue");
      wildcard3a.addColor("orange");
      wildcard3a.addColor("purple");
      wildcard3a.addColor("black");
      wildcard3a.addColor("red");
      wildcard3a.addColor("ltgreen");
      wildcard3a.addColor("yellow");
      return wildcard3a;
    }
    if (type == "wild ltblue brown") {
      WildCard wildcard2 =
          new WildCard("ltblue/brown Wild Card", "Use with ltblue/brown properties", 1);
      wildcard2.addColor("ltblue");
      wildcard2.addColor("brown");
      return wildcard2;
    }
    if (type == "baltic") {
      return new PropertyCard("Baltic", "Baltic Ave", 1, "brown");
    }
    if (type == "connecticut") {
      return new PropertyCard("Connecticut", "Connecticut Ave", 1, "ltblue");
    }
    if (type == "oriental") {
      return new PropertyCard("Oriental", "Oriental Ave", 1, "ltblue");
    }
    return new PropertyCard("Oriental", "Oriental Ave", 1, "ltblue");
  }

  public static void main(String[] args) {
    Player andrew = new Player();
    Player javin = new Player();
    // System.out.println(andrew.getName());
    // System.out.println(javin.getName());

    Deck newDeck = new Deck();
    newDeck.shuffle();
    // loop

    while (andrew.getHand().size() < 5) {
      Card c = newDeck.draw();
      andrew.addCardToHand(c);
    }

    // System.out.println(andrew.cardNamesInHand());

    // andrew.discardFromHand(7);

    // System.out.println(andrew.cardNamesInHand());

    // Test for num property sets
    andrew.addCardToHand(GameTester.getCard("baltic"));
    andrew.addCardToHand(GameTester.getCard("oriental"));
    andrew.addCardToHand(GameTester.getCard("connecticut"));
    Card c1 = GameTester.getCard("wild ltblue brown");
    c1.setColor("ltblue");
    andrew.addCardToHand(c1);
    Card c2 = GameTester.getCard("wild");
    c2.setColor("brown");
    andrew.addCardToHand(c2);

    System.out.println("Cards in Hand: ");
    System.out.println(andrew.cardNamesInHand());

    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);

    System.out.println("Cards on table: ");
    System.out.println(andrew.cardNamesOnTable());

    System.out.println(andrew.numCardsOnTableByColor("brown")); // Should print 2
    System.out.println(andrew.numCardsOnTableByColor("ltblue")); // Should print 3

    System.out.println(andrew.numPropertySets()); // Should print 2
  }
}
