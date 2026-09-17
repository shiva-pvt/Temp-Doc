package tutorial5.priority;

public class Patient implements Comparable<Patient> {
    private final int patientId;
    private final String name;
    private final int age;
    private final int emergencyLevel;

    public Patient(int patientId, String name, int age, int emergencyLevel) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.emergencyLevel = emergencyLevel;
    }

    @Override
    public int compareTo(Patient other) {
        if (emergencyLevel != other.emergencyLevel) {
            return Integer.compare(other.emergencyLevel, emergencyLevel);
        }
        return Integer.compare(other.age, age);
    }

    public void display() {
        System.out.printf("%d %s %d %d%n", patientId, name, age, emergencyLevel);
    }
}
