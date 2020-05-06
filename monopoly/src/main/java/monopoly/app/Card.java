package monopoly.app;

public class Card {

  static int instanceCounter = 0;
  protected String name, type, description;
  protected int moneyValue, cardId;

  public Card() {
    instanceCounter++;
    this.name = "undefined";
    this.type = "undefined";
    this.description = "undefined";
    this.moneyValue = 0;
    this.cardId = instanceCounter;
  }

  public Card(String name, String type, String description, int moneyValue) {
    instanceCounter++;
    this.name = name;
    this.type = type;
    this.description = description;
    this.moneyValue = moneyValue;
    this.cardId = instanceCounter;
  }

  public int getCardId() {
    return cardId;
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

  public boolean hasColor(String color) {
    return false;
  }

  public void setColor(String color) {
    return;
  }

  public String toString() {
    return String.format(
        "Card(name=%s, type=%s, description=%s, moneyValue=%d)",
        name, type, description, moneyValue);
  }
}
