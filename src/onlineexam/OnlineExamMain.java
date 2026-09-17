package onlineexam;

public class OnlineExamMain {
    private static class ExamActivity implements Runnable {
        private final String activity;
        private final int interval;
        private final int repetitions;

        ExamActivity(String activity, int interval, int repetitions) {
            this.activity = activity;
            this.interval = interval;
            this.repetitions = repetitions;
        }

        @Override
        public void run() {
            for (int i = 1; i <= repetitions; i++) {
                System.out.printf("[%s] %s (cycle %d)%n",
                        Thread.currentThread().getName(), activity, i);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread timer = new Thread(new ExamActivity("Displaying remaining time", 1000, 5));
        Thread autoSave = new Thread(new ExamActivity("Auto-saving student answers", 1500, 4));
        Thread network = new Thread(new ExamActivity("Checking network connection", 2000, 3));

        timer.setName("Exam-Timer");
        autoSave.setName("Auto-Save");
        network.setName("Network-Monitor");

        timer.start();
        autoSave.start();
        network.start();
        timer.join();
        autoSave.join();
        network.join();
        System.out.println("Online examination monitoring completed.");
    }
}
