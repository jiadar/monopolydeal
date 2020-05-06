package monopoly.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {

  @Test
  public void testName() {
    PropertyCard c = new PropertyCard("Boardwalk", "Boardwalk", 4, "blue");
    assertTrue(c.getName() == "Boardwalk");
  }

  @Test
  public void testBuildings() {
    PropertyCard c = new PropertyCard("Boardwalk", "Boardwalk", 4, "blue");
    assertTrue(c.hasHouse() == false);
    c.addHotel();
    assertTrue(c.hasHotel() == false);
    c.addHouse();
    assertTrue(c.hasHouse() == true);
    c.addHotel();
    assertTrue(c.hasHotel() == true);
    c.removeHouse();
    assertTrue(c.hasHouse() == true);
    assertTrue(c.hasHotel() == true);
  }

  @Test
  public void testActionCard() {
    ActionCard a = new ActionCard("Deal breaker", "Take a full set from your opponent", 5);
    assertTrue("Deal breaker" == a.getName());
  }

  @Test
  public void testRentCard() {
    RentCard r = new RentCard("Green/Blue", "Charge rent on green or blue properties you own", 1);
    r.addColor("green");
    r.addColor("blue");
    assertTrue("[green, blue]".compareTo(r.getColors().toString()) == 0);
  }

  @Test
  public void testWildCard() {
    WildCard w = new WildCard("All Colors Wild Card", "Use on anything", 0);
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
    assertTrue(
        "[brown, blue, green, ltblue, orange, purple, black, red, ltgreen, yellow]"
                .compareTo(w.getColors())
            == 0);
  }
}
