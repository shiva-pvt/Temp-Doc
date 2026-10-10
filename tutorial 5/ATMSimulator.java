import java.util.Scanner;

class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean authenticate(int accNo, int p) {
        return this.accountNumber == accNo && this.pin == p;
    }

    public void checkBalance() {
        System.out.printf("Balance: %.0f\n", balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        if (amount % 100 != 0) {
            System.out.println("Invalid Amount");
            return;
        }
        if (balance - amount < 500) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal Successful");
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(12345, 1234, 5000.0);
        
        if (!sc.hasNextInt()) return;
        int accNo = sc.nextInt();
        int pin = sc.nextInt();
        
        if (!account.authenticate(accNo, pin)) {
            System.out.println("Invalid PIN");
            return;
        }
        
        while (sc.hasNextInt()) {
            int op = sc.nextInt();
            if (op == 1) {
                account.checkBalance();
            } else if (op == 2) {
                double amt = sc.nextDouble();
                account.deposit(amt);
            } else if (op == 3) {
                double amt = sc.nextDouble();
                account.withdraw(amt);
            } else if (op == 4) {
                break;
            }
        }
        sc.close();
    }
}
