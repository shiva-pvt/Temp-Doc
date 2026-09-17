package tutorial6.wallet;

import java.util.Scanner;

public class WalletMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wallet wallet = new Wallet(scanner.next(), scanner.next(), scanner.nextDouble());
        int transactionCount = scanner.nextInt();

        for (int i = 0; i < transactionCount; i++) {
            String transactionType = scanner.next();
            double amount = scanner.nextDouble();
            if (transactionType.equalsIgnoreCase("D")) {
                wallet.deposit(amount);
            } else if (transactionType.equalsIgnoreCase("W")) {
                wallet.withdraw(amount);
            }
        }

        System.out.println("Final Balance: " + format(wallet.getBalance()));
    }

    private static String format(double value) {
        return value == Math.rint(value) ? String.valueOf((long) value) : String.valueOf(value);
    }
}
