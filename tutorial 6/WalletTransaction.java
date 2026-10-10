import java.util.Scanner;

class Wallet {
    private String walletId;
    private String customerName;
    private double balance;

    public Wallet(String walletId, String customerName, double balance) {
        this.walletId = walletId;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void getBalance() {
        System.out.printf("Final Balance: %.0f\n", balance);
    }
}

public class WalletTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String wId = sc.next();
        String name = sc.next();
        double bal = sc.nextDouble();
        Wallet w = new Wallet(wId, name, bal);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String op = sc.next();
                double amt = sc.nextDouble();
                if (op.equals("D")) {
                    w.deposit(amt);
                } else if (op.equals("W")) {
                    w.withdraw(amt);
                }
            }
        }
        w.getBalance();
        sc.close();
    }
}
