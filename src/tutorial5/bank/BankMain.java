package tutorial5.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(scanner.next(), scanner.next(), scanner.nextDouble());
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String operation = scanner.next();
            double amount = scanner.nextDouble();
            if (operation.equalsIgnoreCase("D")) account.deposit(amount);
            else if (operation.equalsIgnoreCase("W")) account.withdraw(amount);
        }
        account.checkBalance();
    }
}
