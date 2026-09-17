package tutorial5.billing;

import java.util.Scanner;

public class BillingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Product product = new Product(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextInt());
            product.display();
        }
    }
}
