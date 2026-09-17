package tutorial6.ride;

public class PremiumCar extends Ride {
    public PremiumCar(int id, String name, double distance) { super(id, name, distance); }
    public double getBaseFare() { return 100; }
    public double getPerKmRate() { return 30; }
    public String getRideType() { return "PremiumCar"; }
}
