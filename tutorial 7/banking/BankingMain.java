package banking;
class BankTask implements Runnable {
    private String activity;
    private long sleepTime;
    
    public BankTask(String activity, long sleepTime) {
        this.activity = activity;
        this.sleepTime = sleepTime;
    }
    
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " -> Activity: " + activity + " (Count: " + i + ")");
            try { Thread.sleep(sleepTime); } catch(InterruptedException e) {}
        }
    }
}
public class BankingMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new BankTask("Transaction processing", 1000));
        t1.setName("TransactionThread");
        Thread t2 = new Thread(new BankTask("Balance updating", 1500));
        t2.setName("BalanceThread");
        Thread t3 = new Thread(new BankTask("SMS notification", 2000));
        t3.setName("SMSThread");
        
        t1.start(); t2.start(); t3.start();
    }
}
