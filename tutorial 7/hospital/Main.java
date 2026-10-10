package hospital;
import hospital.doctor.Doctor;
import hospital.patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Dr. Smith", "Cardiology", 1500);
        Doctor d2 = new Doctor(2, "Dr. Adams", "Neurology", 2000);
        
        Patient p1 = new Patient(101, "John", "Cardiology", 45);
        Patient p2 = new Patient(102, "Alice", "Neurology", 30);
        Patient p3 = new Patient(103, "Bob", "Cardiology", 50);
        
        Patient[] patients = {p1, p2, p3};
        Doctor[] doctors = {d1, d2};
        
        int[] patientCount = new int[doctors.length];
        
        for (Patient p : patients) {
            p.display();
            for (int i = 0; i < doctors.length; i++) {
                if (p.getDisease().equals(doctors[i].getSpecialization())) {
                    System.out.print("Assigned to: ");
                    doctors[i].display();
                    patientCount[i]++;
                }
            }
            System.out.println();
        }
        
        System.out.println("Total Consultation Fees Collected:");
        for (int i = 0; i < doctors.length; i++) {
            System.out.println("Doctor (" + doctors[i].getSpecialization() + ") -> Total Fee: " + (patientCount[i] * doctors[i].getConsultationFee()));
        }
    }
}
