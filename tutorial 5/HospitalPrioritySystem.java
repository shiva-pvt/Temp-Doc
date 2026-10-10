import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Patient {
    int patientId;
    String name;
    int age;
    int emergencyLevel;

    public Patient(int patientId, String name, int age, int emergencyLevel) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.emergencyLevel = emergencyLevel;
    }
}

public class HospitalPrioritySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            patients[i] = new Patient(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        
        Arrays.sort(patients, new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                if (p1.emergencyLevel != p2.emergencyLevel) {
                    return p2.emergencyLevel - p1.emergencyLevel;
                }
                return p2.age - p1.age;
            }
        });
        
        for (Patient p : patients) {
            System.out.printf("%d %s %d %d\n", p.patientId, p.name, p.age, p.emergencyLevel);
        }
        sc.close();
    }
}
