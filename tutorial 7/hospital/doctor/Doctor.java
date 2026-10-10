package hospital.doctor;
public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private double consultationFee;
    public Doctor(int doctorId, String name, String specialization, double consultationFee) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    public String getSpecialization() { return specialization; }
    public double getConsultationFee() { return consultationFee; }
    public void display() {
        System.out.println("Doctor: " + name + " (" + specialization + "), Fee: " + consultationFee);
    }
}
