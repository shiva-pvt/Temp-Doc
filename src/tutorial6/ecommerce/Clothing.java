package tutorial6.ecommerce;

public class Clothing extends Product {
    public Clothing(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * getQuantity() * (getPrice() >= 5000 ? 0.20 : 0.10);
    }
}
