package tutorial6.ecommerce;

public class Electronics extends Product {
    public Electronics(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        double rate = getPrice() >= 50000 ? 0.15 : getPrice() >= 20000 ? 0.10 : 0.05;
        return getPrice() * getQuantity() * rate;
    }
}
