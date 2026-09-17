package traffic;

public class TrafficMain {
    private static class Junction extends Thread {
        private final String status;
        private final int interval;

        Junction(String name, String status, int interval) {
            setName(name);
            this.status = status;
            this.interval = interval;
        }

        @Override
        public void run() {
            for (int report = 1; report <= 3; report++) {
                System.out.printf("[%s] Traffic status: %s (report %d)%n",
                        getName(), status, report);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException exception) {
                    interrupt();
                    System.out.println(getName() + " monitoring interrupted.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Junction north = new Junction("North-Junction", "Heavy", 800);
        Junction south = new Junction("South-Junction", "Moderate", 1200);
        Junction east = new Junction("East-Junction", "Light", 1600);

        north.start();
        south.start();
        east.start();
        north.join();
        south.join();
        east.join();
        System.out.println("Traffic monitoring completed.");
    }
}
