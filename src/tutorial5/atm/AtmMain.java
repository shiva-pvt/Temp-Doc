package tutorial5.atm;

import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber = scanner.next();
        String correctPin = scanner.next();
        Account account = new Account(accountNumber, correctPin, 5000);

        boolean authenticated = false;
        for (int attempt = 0; attempt < 3 && scanner.hasNext(); attempt++) {
            String enteredPin = scanner.next();
            if (account.verifyPin(enteredPin)) {
                authenticated = true;
                break;
            }
            System.out.println("Incorrect PIN");
        }
        if (!authenticated) return;

        while (scanner.hasNextInt()) {
            int operation = scanner.nextInt();
            if (operation == 1) account.checkBalance();
            else if (operation == 2) account.deposit(scanner.nextDouble());
            else if (operation == 3) account.withdraw(scanner.nextDouble());
            else if (operation == 4) break;
        }
    }
}
