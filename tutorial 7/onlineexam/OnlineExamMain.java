package onlineexam;
class ExamTask implements Runnable {
    private String activity;
    private long sleepTime;
    
    public ExamTask(String activity, long sleepTime) {
        this.activity = activity;
        this.sleepTime = sleepTime;
    }
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " -> Activity: " + activity);
            try { Thread.sleep(sleepTime); } catch(InterruptedException e) {}
        }
    }
}

public class OnlineExamMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExamTask("Displaying remaining time", 1000));
        t1.setName("TimeThread");
        Thread t2 = new Thread(new ExamTask("Auto-saving answers", 2000));
        t2.setName("SaveThread");
        Thread t3 = new Thread(new ExamTask("Checking network connection", 1500));
        t3.setName("NetworkThread");
        
        t1.start(); t2.start(); t3.start();
    }
}
