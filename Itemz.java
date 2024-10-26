import java.util.ArrayList;
import java.util.List;

class Itemz {
    // Properties of the Itemz class
    private String name;
    private double price;
    private int qty;
    private String category = "general";
    private double envFee = 0.0;

    // Constructor for Itemz
    public Itemz(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Method to calculate total price of the item
    public double getTotal() {
        return this.price * this.qty;
    }

    // Method to calculate discounted price
    public double getMostPrices() {
        return this.price * this.qty * 0.6;
    }

    // Getter and Setter for category
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}

