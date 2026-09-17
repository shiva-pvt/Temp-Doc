package tutorial6.hospital;

public abstract class Doctor {
    private final int doctorId;
    private final String doctorName;
    private final double consultationFee;

    protected Doctor(int doctorId, String doctorName, double consultationFee) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    protected abstract double getAdditionalCharge();
    public abstract String getDoctorType();

    public double calculateConsultationFee(String appointmentType) {
        double emergencyCharge = appointmentType.equalsIgnoreCase("Emergency") ? 1000 : 0;
        return consultationFee + getAdditionalCharge() + emergencyCharge;
    }

    public double getConsultationFee() { return consultationFee; }
    public String getDoctorName() { return doctorName; }
    public int getDoctorId() { return doctorId; }
    public double getEmergencyCharge(String appointmentType) {
        return appointmentType.equalsIgnoreCase("Emergency") ? 1000 : 0;
    }

    public void display(String appointmentType) {
        System.out.println("Doctor: " + doctorName);
        System.out.println("Type: " + getDoctorType());
        System.out.println("Basic Fee: " + format(consultationFee));
        System.out.println("Specialist Charge: " + format(getAdditionalCharge()));
        System.out.println("Emergency Charge: " + format(getEmergencyCharge(appointmentType)));
        System.out.println("Final Consultation Fee: " + format(calculateConsultationFee(appointmentType)));
    }

    protected static String format(double amount) {
        return amount == Math.rint(amount) ? String.valueOf((long) amount) : String.format("%.2f", amount);
    }
}
