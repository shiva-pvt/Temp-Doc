package hospital;

import hospital.doctor.Doctor;
import hospital.patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor cardiologist = new Doctor(201, "Dr. Mehta", "Cardiology", 1200.00);
        Doctor dermatologist = new Doctor(202, "Dr. Iyer", "Dermatology", 900.00);

        Patient patient1 = new Patient(301, "Ravi Kumar", "Heart disease", 52);
        Patient patient2 = new Patient(302, "Priya Singh", "Skin allergy", 28);
        Patient patient3 = new Patient(303, "Arjun Patel", "Hypertension", 45);

        patient1.assignDoctor(cardiologist);
        patient2.assignDoctor(dermatologist);
        patient3.assignDoctor(cardiologist);

        Patient[] patients = {patient1, patient2, patient3};
        for (Patient patient : patients) {
            System.out.println("\n--- Patient and Treating Doctor ---");
            patient.display();
            System.out.println("Treating Doctor:");
            patient.getAssignedDoctor().display();
        }

        int cardiologistPatients = 0;
        int dermatologistPatients = 0;
        for (Patient patient : patients) {
            if (patient.getAssignedDoctor() == cardiologist) {
                cardiologistPatients++;
            } else if (patient.getAssignedDoctor() == dermatologist) {
                dermatologistPatients++;
            }
        }

        System.out.println("\n--- Consultation Fee Summary ---");
        System.out.printf("%s: %.2f (%d patients)%n", cardiologist.getName(),
                cardiologistPatients * cardiologist.getConsultationFee(), cardiologistPatients);
        System.out.printf("%s: %.2f (%d patients)%n", dermatologist.getName(),
                dermatologistPatients * dermatologist.getConsultationFee(), dermatologistPatients);
    }
}
