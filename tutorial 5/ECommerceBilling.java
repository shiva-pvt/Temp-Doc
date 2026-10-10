import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void calculateBill() {
        double discountRate = 0;
        if (price >= 10000) {
            discountRate = 0.20;
        } else if (price >= 5000) {
            discountRate = 0.15;
        } else if (price >= 1000) {
            discountRate = 0.10;
        }
        double total = price * quantity;
        double finalAmount = total - (total * discountRate);
        System.out.printf("%d %s %.2f\n", productId, productName, finalAmount);
    }
}

public class ECommerceBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            Product p = new Product(id, name, price, qty);
            p.calculateBill();
        }
        sc.close();
    }
}
