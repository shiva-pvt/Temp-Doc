package tutorial5.bank;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
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
        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal Successful");
        if (balance < 1000) System.out.println("LOW BALANCE");
    }

    public void checkBalance() {
        System.out.println("Balance: " + format(balance));
    }

    private String format(double amount) {
        return amount == Math.rint(amount) ? String.valueOf((long) amount) : String.valueOf(amount);
    }
}
