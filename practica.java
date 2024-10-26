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

class ShoppingCart {
    // Properties of the ShoppingCart class
    private List<Itemz> items = new ArrayList<>();
    private final double taxRate = 0.08;
    private final double memberDiscount = 0.05;
    private final double bigSpenderDiscount = 10;
    private final double couponDiscount = 0.15;
    private final String currency = "USD";

    // Method to add an item to the cart
    public void addItem(Itemz item) {
        this.items.add(item);
    }

    // Method to calculate subtotal
    public double calculateSubtotal() {
        double subtotal = 0;
        for (Itemz item : this.items) {
            subtotal += item.getTotal();
        }
        return subtotal;
    }

    // Method to apply discounts
    public double applyDiscounts(double subtotal, boolean isMember) {
        if (isMember) {
            subtotal -= subtotal * memberDiscount;
        }
        if (subtotal > 100) {
            subtotal -= bigSpenderDiscount;
        }
        return subtotal;
    }

    // Method to calculate total price
    public double calculateTotal(boolean isMember, boolean hasCoupon) {
        double subtotal = calculateSubtotal();
        subtotal = applyDiscounts(subtotal, isMember);
        double total = subtotal + (subtotal * taxRate);

        if (hasCoupon) {
            total -= total * couponDiscount;
        }
        return total;
    }
}

