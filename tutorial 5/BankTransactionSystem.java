import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) return;
        if (balance - amount < 500) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            if (balance < 1000) {
                System.out.println("LOW BALANCE");
            }
        }
    }

    public void checkBalance() {
        System.out.printf("Balance: %.0f\n", balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int accNo = sc.nextInt();
        String name = sc.next();
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accNo, name, balance);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            double amt = sc.nextDouble();
            if (op.equals("D")) {
                account.deposit(amt);
            } else if (op.equals("W")) {
                account.withdraw(amt);
            }
        }
        account.checkBalance();
        sc.close();
    }
}
