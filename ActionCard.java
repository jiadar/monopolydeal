public class ActionCard extends Card {

    public ActionCard(String name, String description, int moneyValue) {
        super(name, "Action", description, moneyValue);
    }

    public String toString() {
        String fstr = "";
        fstr = "ActionCard(name=%s, type=%s, description=%s, moneyValue=%d)";
        return String.format(fstr, name, type, description, moneyValue);
    }
}