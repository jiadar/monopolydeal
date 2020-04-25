
public class PropertyCard extends Card {

    boolean house, hotel;
    String color;

    public PropertyCard(String name, String description, int moneyValue) {
        super(name, "Property", description, moneyValue);
        color = "undefined";
        house = false;
        hotel = false;
    }

    public PropertyCard(String name, String description, int moneyValue, String color) {
        super(name, "Property", description, moneyValue);
        this.color = color;
        house = false;
        hotel = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addHotel() {
        if (house) {
            hotel = true;
        }
    }

    public void removeHotel() {
        hotel = false;
    }

    public void addHouse() {
        if (!hotel) {
            house = true;
        }
    }

    public void removeHouse() {
        if (!hotel) {
            house = false;
        }
    }

    public boolean hasHouse() {
        return house;
    }

    public boolean hasHotel() {
        return hotel;
    }


    public String toString() {
        String fstr = "";
        fstr = "PropertyCard(name=%s, type=%s, description=%s, moneyValue=%d";
        fstr += ", color=%s, house=%s, hotel=%s)";
        return String.format(fstr, name, type, description, moneyValue, color, house, hotel);
    }
}
