package tutorial6.wallet;

public class Wallet {
    private final String walletId;
    private final String customerName;
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
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getCustomerName() {
        return customerName;
    }
}
