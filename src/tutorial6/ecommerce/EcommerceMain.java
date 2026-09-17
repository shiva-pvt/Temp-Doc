package tutorial6.ecommerce;

import java.util.Scanner;

public class EcommerceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Product[] products = new Product[count];

        for (int i = 0; i < count; i++) {
            String type = scanner.next();
            int id = scanner.nextInt();
            String name = scanner.next();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = switch (type) {
                case "Electronics" -> new Electronics(id, name, price, quantity);
                case "Clothing" -> new Clothing(id, name, price, quantity);
                case "Grocery" -> new Grocery(id, name, price, quantity);
                default -> throw new IllegalArgumentException("Unknown product type: " + type);
            };
        }

        for (Product product : products) {
            product.display();
            System.out.println();
        }
    }
}
