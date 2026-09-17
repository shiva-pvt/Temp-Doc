package tutorial6.hospital;

public class Specialist extends Doctor {
    public Specialist(int id, String name, double fee) { super(id, name, fee); }
    protected double getAdditionalCharge() { return 500; }
    public String getDoctorType() { return "Specialist"; }
}
