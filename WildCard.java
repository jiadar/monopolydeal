import java.util.ArrayList;

public class WildCard extends Card {

  ArrayList<String> colors;
  String designatedColor;

  public WildCard(String name, String description, int moneyValue) {
    super(name, "Wild", description, moneyValue);
    colors = new ArrayList<String>();
  }

  public void addColor(String color) {
    colors.add(color);
    this.designatedColor = color;
  }

  public String getColors() {
    String rval = "[";
    for (String color : colors) {
      rval += color + ", ";
    }
    rval = rval.length() > 1 ? rval.substring(0, rval.length() - 2) : rval;
    rval += "]";
    return rval;
  }

  public boolean matches(String colorToMatch) {
    for (String color : colors) {
      if (color == colorToMatch) {
        return true;
      }
    }
    return false;
  }

  public boolean canBecomeColor(String color) {
    return this.matches(color);
  }

  public boolean hasColor(String color) {
    return designatedColor == color;
  }

  public void setColor(String color) {
    if (this.matches(color)) {
      this.designatedColor = color;
    }
  }

  public String getDesignatedColor() {
    return designatedColor;
  }

  public String toString() {
    String fstr = "";
    fstr = "WildCard(name=%s, type=%s, description=%s, moneyValue=%d, colors=%s)";
    return String.format(fstr, name, type, description, moneyValue, this.getColors());
  }
}
