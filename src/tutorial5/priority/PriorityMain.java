package tutorial5.priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PriorityMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            patients.add(new Patient(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(patients);
        for (Patient patient : patients) patient.display();
    }
}
