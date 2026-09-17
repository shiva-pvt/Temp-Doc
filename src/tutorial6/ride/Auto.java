package tutorial6.ride;

public class Auto extends Ride {
    public Auto(int id, String name, double distance) { super(id, name, distance); }
    public double getBaseFare() { return 30; }
    public double getPerKmRate() { return 12; }
    public String getRideType() { return "Auto"; }
}
