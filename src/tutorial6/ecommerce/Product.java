package tutorial6.ecommerce;

public abstract class Product {
    private final int productId;
    private final String productName;
    private final double price;
    private final int quantity;

    protected Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateDiscount();

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getProductName() { return productName; }
    public int getProductId() { return productId; }

    public void display() {
        double total = price * quantity;
        double discount = calculateDiscount();
        System.out.println(productName);
        System.out.println("Total: " + money(total));
        System.out.println("Discount: " + money(discount));
        System.out.println("Final Amount: " + money(total - discount));
    }

    protected static String money(double amount) {
        return amount == Math.rint(amount) ? String.valueOf((long) amount) : String.format("%.2f", amount);
    }
}
