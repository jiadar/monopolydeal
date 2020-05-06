package monopoly.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeckTest {
  @Test
  public void orderTest() {
    Deck d = new Deck();
    int first = d.order().get(0);
    int last = d.order().get(d.numCardsInDeck() - 1);
    assertTrue((last - first) == d.numCardsInDeck() - 1);
  }

  @Test
  public void drawTest() {
    Deck d = new Deck();
    d.shuffle();
    Card drawn = d.draw();
    assertTrue(d.numCardsInDeck() == 107);
  }

  public void shuffleTest() {
    Deck d = new Deck();
    d.shuffle();
    int first = d.order().get(0);
    int last = d.order().get(d.numCardsInDeck() - 1);
    assertTrue((last - first) != d.numCardsInDeck() - 1);
  }
}
