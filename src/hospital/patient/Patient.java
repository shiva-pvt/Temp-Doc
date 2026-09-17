package hospital.patient;

import hospital.doctor.Doctor;

public class Patient {
    private final int patientId;
    private final String name;
    private final String disease;
    private final int age;
    private Doctor assignedDoctor;

    public Patient(int patientId, String name, String disease, int age) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public int getAge() {
        return age;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void assignDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    public void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Age: " + age);
    }
}
