public class Card {

  protected String name, type, description;
  protected int moneyValue;

  public Card(String name, String type, String description, int moneyValue) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.moneyValue = moneyValue;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getMoneyValue() {
    return moneyValue;
  }

  public void setMoneyValue(int moneyValue) {
    this.moneyValue = moneyValue;
  }

  public String toString() {
    return String.format(
        "Card(name=%s, type=%s, description=%s, moneyValue=%d)",
        name, type, description, moneyValue);
  }
}
