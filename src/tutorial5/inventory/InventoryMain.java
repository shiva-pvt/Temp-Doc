package tutorial5.inventory;

import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextInt());
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String operation = scanner.next();
            int quantity = scanner.nextInt();
            if (operation.equalsIgnoreCase("SELL")) product.sellProduct(quantity);
            else if (operation.equalsIgnoreCase("ADD")) product.addStock(quantity);
        }
    }
}
