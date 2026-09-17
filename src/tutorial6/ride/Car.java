package tutorial6.ride;

public class Car extends Ride {
    public Car(int id, String name, double distance) { super(id, name, distance); }
    public double getBaseFare() { return 50; }
    public double getPerKmRate() { return 18; }
    public String getRideType() { return "Car"; }
}
