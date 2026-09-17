package tutorial5.inventory;

public class Product {
    private final int productId;
    private final String productName;
    private final double price;
    private int stock;

    public Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void addStock(int quantity) {
        if (quantity > 0) stock += quantity;
    }

    public void sellProduct(int quantity) {
        if (quantity <= 0 || quantity > stock) {
            System.out.println("Insufficient Stock");
            return;
        }
        stock -= quantity;
        System.out.println("Sold Successfully");
        displayProduct();
        if (stock == 0) System.out.println("OUT OF STOCK");
        else if (stock < 5) System.out.println("LOW STOCK");
    }

    public void displayProduct() {
        System.out.println("Stock: " + stock);
    }
}
