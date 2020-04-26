public class CardTester {

  static void print(int testNumber, Object expected, Object o) {
    System.out.print(String.format("Test %02d", testNumber));
    if (expected.toString().compareTo(o.toString()) == 0) {
      System.out.print(" PASS: ");
    } else {
      System.out.print(" FAIL: ");
    }
    System.out.print("expected: `" + expected.toString() + "` and got `");
    System.out.println(o.toString() + "`");
  }

  public static void main(String[] args) {
    // Create the different types of cards
    PropertyCard c = new PropertyCard("Boardwalk", "Boardwalk", 4, "blue");
    MoneyCard m = new MoneyCard("10M", "10 million", 10);
    ActionCard a = new ActionCard("Deal breaker", "Take a full set from your opponent", 5);
    RentCard r = new RentCard("Green/Blue", "Charge rent on green or blue properties you own", 1);
    WildCard w = new WildCard("All Colors Wild Card", "Use on anything", 0);

    // Print the cards
    System.out.println(c);
    System.out.println(m);
    System.out.println(a);
    System.out.println(r);
    System.out.println(w);

    print(1, "Boardwalk", c.getName());

    print(2, false, c.hasHouse());

    c.addHotel();
    print(3, false, c.hasHotel());

    c.addHouse();
    print(4, true, c.hasHouse());

    c.addHotel();
    print(5, true, c.hasHotel());

    c.removeHouse();
    print(6, true, c.hasHouse());
    print(7, true, c.hasHotel());

    // Tests for MoneyCard

    print(8, 10, m.getMoneyValue());

    // Tests for Action Card
    print(9, "Deal breaker", a.getName());

    // Tests for RentCard
    r.addColor("green");
    r.addColor("blue");
    print(10, "[green, blue]", r.getColors());

    // Tests for Wild Cards
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
    print(
        11,
        "[brown, blue, green, ltblue, orange, purple, black, red, ltgreen, yellow]",
        w.getColors());
    print(12, "5", w.getCardId());
  }
}
