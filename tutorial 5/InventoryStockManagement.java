import java.util.Scanner;

class InventoryProduct {
    int productId;
    String productName;
    double price;
    int stock;

    public InventoryProduct(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void sellProduct(int qty) {
        if (qty > stock) {
            return;
        }
        stock -= qty;
        System.out.println("Sold Successfully");
        if (stock == 0) {
            System.out.println("OUT OF STOCK");
        } else if (stock < 5) {
            System.out.println("LOW STOCK");
        }
        displayProduct();
    }

    public void displayProduct() {
        System.out.println("Stock: " + stock);
    }
}

public class InventoryStockManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int id = sc.nextInt();
        String name = sc.next();
        double price = sc.nextDouble();
        int stock = sc.nextInt();
        InventoryProduct p = new InventoryProduct(id, name, price, stock);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.equals("SELL")) {
                int qty = sc.nextInt();
                p.sellProduct(qty);
            }
        }
        sc.close();
    }
}
