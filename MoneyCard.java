public class MoneyCard extends Card {

  public MoneyCard(String name, String description, int moneyValue) {
    super(name, "Money", description, moneyValue);
  }

  public String toString() {
    String fstr = "";
    fstr = "MoneyCard(name=%s, type=%s, description=%s, moneyValue=%d)";
    return String.format(fstr, name, type, description, moneyValue);
  }
}
