package tutorial6.ecommerce;

public class Grocery extends Product {
    public Grocery(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * getQuantity() * (getPrice() >= 3000 ? 0.05 : 0.02);
    }
}
