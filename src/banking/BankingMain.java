package banking;

public class BankingMain {
    private static class BankingActivity implements Runnable {
        private final String activity;
        private final int delay;

        BankingActivity(String activity, int delay) {
            this.activity = activity;
            this.delay = delay;
        }

        @Override
        public void run() {
            for (int count = 1; count <= 3; count++) {
                System.out.printf("[%s] %s - execution %d%n",
                        Thread.currentThread().getName(), activity, count);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread transaction = new Thread(new BankingActivity("Processing transaction", 700));
        Thread balance = new Thread(new BankingActivity("Updating account balance", 1000));
        Thread sms = new Thread(new BankingActivity("Sending SMS notification", 1300));

        transaction.setName("Transaction-Processor");
        balance.setName("Balance-Updater");
        sms.setName("SMS-Notifier");

        transaction.start();
        balance.start();
        sms.start();
        transaction.join();
        balance.join();
        sms.join();
        System.out.println("Banking activities completed.");
    }
}
