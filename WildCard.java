import java.util.ArrayList;

public class WildCard extends Card {

  ArrayList<String> colors;

  public WildCard(String name, String description, int moneyValue) {
    super(name, "Wild", description, moneyValue);
    colors = new ArrayList<String>();
  }

  public void addColor(String color) {
    colors.add(color);
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

  public String toString() {
    String fstr = "";
    fstr = "WildCard(name=%s, type=%s, description=%s, moneyValue=%d, colors=%s)";
    return String.format(fstr, name, type, description, moneyValue, this.getColors());
  }
}
