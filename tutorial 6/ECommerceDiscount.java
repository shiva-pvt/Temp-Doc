import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getProductName() { return productName; }
    
    public void calculateDiscount(double discountPercentage) {
        double total = price * quantity;
        double discount = total * discountPercentage;
        double finalAmount = total - discount;
        System.out.println(productName);
        System.out.printf("Total: %.0f\n", total);
        System.out.printf("Discount: %.0f\n", discount);
        System.out.printf("Final Amount: %.0f\n", finalAmount);
    }
}

class Electronics extends Product {
    public Electronics(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }
    public void calculateDiscount() {
        double p = getPrice();
        double disc = 0.05;
        if (p >= 50000) disc = 0.15;
        else if (p >= 20000) disc = 0.10;
        super.calculateDiscount(disc);
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }
    public void calculateDiscount() {
        double p = getPrice();
        double disc = 0.10;
        if (p >= 5000) disc = 0.20;
        super.calculateDiscount(disc);
    }
}

class Grocery extends Product {
    public Grocery(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }
    public void calculateDiscount() {
        double p = getPrice();
        double disc = 0.02;
        if (p >= 3000) disc = 0.05;
        super.calculateDiscount(disc);
    }
}

public class ECommerceDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            
            if (type.equals("Electronics")) {
                new Electronics(id, name, price, qty).calculateDiscount();
            } else if (type.equals("Clothing")) {
                new Clothing(id, name, price, qty).calculateDiscount();
            } else if (type.equals("Grocery")) {
                new Grocery(id, name, price, qty).calculateDiscount();
            }
        }
        sc.close();
    }
}
