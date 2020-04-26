public class DeckTester {

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
    Deck d = new Deck();
    System.out.println("\nThe current deck is:");
    System.out.println(d);

    print(1, "108", d.numCardsInDeck());


  }
}
