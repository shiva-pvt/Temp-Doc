package tutorial6.ride;

import java.util.Scanner;

public class RideMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        int id = scanner.nextInt();
        String name = scanner.next();
        double distance = scanner.nextDouble();

        Ride ride = switch (type) {
            case "Bike" -> new Bike(id, name, distance);
            case "Auto" -> new Auto(id, name, distance);
            case "Car" -> new Car(id, name, distance);
            case "PremiumCar" -> new PremiumCar(id, name, distance);
            default -> throw new IllegalArgumentException("Unknown ride type: " + type);
        };
        ride.display();
    }
}
