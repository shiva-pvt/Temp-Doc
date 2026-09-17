package tutorial6.hospital;

import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        int id = scanner.nextInt();
        String name = scanner.next();
        double fee = scanner.nextDouble();
        String appointmentType = scanner.next();

        Doctor doctor = switch (type) {
            case "GeneralDoctor" -> new GeneralDoctor(id, name, fee);
            case "Specialist" -> new Specialist(id, name, fee);
            case "Surgeon" -> new Surgeon(id, name, fee);
            default -> throw new IllegalArgumentException("Unknown doctor type: " + type);
        };
        doctor.display(appointmentType);
    }
}
