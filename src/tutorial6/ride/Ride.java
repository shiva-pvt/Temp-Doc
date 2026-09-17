package tutorial6.ride;

public abstract class Ride {
    private final int rideId;
    private final String customerName;
    private final double distance;

    protected Ride(int rideId, String customerName, double distance) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.distance = distance;
    }

    public abstract double getBaseFare();
    public abstract double getPerKmRate();
    public abstract String getRideType();

    public double getDistance() { return distance; }
    public int getRideId() { return rideId; }
    public String getCustomerName() { return customerName; }

    public double calculateFare() {
        double originalFare = getBaseFare() + distance * getPerKmRate();
        return distance > 15 ? originalFare * 0.90 : originalFare;
    }

    public void display() {
        double originalFare = getBaseFare() + distance * getPerKmRate();
        double discount = distance > 15 ? originalFare * 0.10 : 0;
        System.out.println("Ride Type: " + getRideType());
        System.out.println("Distance: " + format(distance));
        System.out.println("Base Fare: " + format(getBaseFare()));
        System.out.println("Original Fare: " + format(originalFare));
        System.out.println("Discount: " + format(discount));
        System.out.println("Final Fare: " + format(calculateFare()));
    }

    protected static String format(double amount) {
        return amount == Math.rint(amount) ? String.valueOf((long) amount) : String.format("%.2f", amount);
    }
}
