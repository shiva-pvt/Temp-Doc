package traffic;
class JunctionThread extends Thread {
    private String status;
    private long sleepTime;
    
    public JunctionThread(String name, String status, long sleepTime) {
        setName(name);
        this.status = status;
        this.sleepTime = sleepTime;
    }
    
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Junction: " + getName() + " -> Status: " + status + " (Report " + i + ")");
            try { Thread.sleep(sleepTime); } catch(InterruptedException e) {}
        }
    }
}
public class TrafficMain {
    public static void main(String[] args) {
        JunctionThread j1 = new JunctionThread("Junction-1", "Heavy Traffic", 1000);
        JunctionThread j2 = new JunctionThread("Junction-2", "Moderate Traffic", 1500);
        JunctionThread j3 = new JunctionThread("Junction-3", "Clear Traffic", 2000);
        
        j1.start(); j2.start(); j3.start();
    }
}
