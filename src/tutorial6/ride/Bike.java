package tutorial6.ride;

public class Bike extends Ride {
    public Bike(int id, String name, double distance) { super(id, name, distance); }
    public double getBaseFare() { return 20; }
    public double getPerKmRate() { return 8; }
    public String getRideType() { return "Bike"; }
}
