package hospital.patient;
public class Patient {
    private int patientId;
    private String name;
    private String disease;
    private int age;
    public Patient(int patientId, String name, String disease, int age) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }
    public String getDisease() { return disease; }
    public void display() {
        System.out.println("Patient: " + name + " (Disease: " + disease + ", Age: " + age + ")");
    }
}
