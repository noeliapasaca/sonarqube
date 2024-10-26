public class EmailApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding sample items to the cart
        Itemz item1 = new Itemz("Apple", 1.5, 10);
        Itemz item2 = new Itemz("Banana", 0.5, 5);
        Itemz item3 = new Itemz("Laptop", 1000, 1);
        item3.setCategory("electronics");

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        boolean isMember = true;
        boolean hasCoupon = true;

        // Calculating and printing the total
        double total = cart.calculateTotal(isMember, hasCoupon);
        
        if (total < 0) {
            System.out.println("Error in calculation!");
        } else {
            System.out.println("The total price is: $" + (int) total);
        }
    }
}
