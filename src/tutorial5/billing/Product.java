package tutorial5.billing;

public class Product {
    private final int productId;
    private final String productName;
    private final double price;
    private final int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateBill() {
        return calculateBill(getDiscountRate(total()));
    }

    public double calculateBill(double discount) {
        return total() - total() * discount;
    }

    private double total() {
        return price * quantity;
    }

    private double getDiscountRate(double amount) {
        if (amount >= 10000) return 0.20;
        if (amount >= 5000) return 0.15;
        if (amount >= 1000) return 0.10;
        return 0;
    }

    public void display() {
        System.out.printf("%d %s %.2f%n", productId, productName, calculateBill());
    }
}
