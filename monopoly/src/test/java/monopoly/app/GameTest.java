package monopoly.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {

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

  @Test
  public void propertySetTest() {
    Player andrew = new Player();
    Deck newDeck = new Deck();
    newDeck.shuffle();
    while (andrew.getHand().size() < 5) {
      Card c = newDeck.draw();
      andrew.addCardToHand(c);
    }
    andrew.addCardToHand(GameTest.getCard("baltic"));
    andrew.addCardToHand(GameTest.getCard("oriental"));
    andrew.addCardToHand(GameTest.getCard("connecticut"));
    Card c1 = GameTest.getCard("wild ltblue brown");
    c1.setColor("ltblue");
    andrew.addCardToHand(c1);
    Card c2 = GameTest.getCard("wild");
    c2.setColor("brown");
    andrew.addCardToHand(c2);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    andrew.playCardToTable(5);
    assertTrue(andrew.numCardsOnTableByColor("brown") == 2); // Should print 2
    assertTrue(andrew.numCardsOnTableByColor("ltblue") == 3); // Should print 3
    assertTrue(andrew.numPropertySets() == 2); // Should print 2
  }
}
