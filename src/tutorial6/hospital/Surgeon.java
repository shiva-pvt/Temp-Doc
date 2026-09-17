package tutorial6.hospital;

public class Surgeon extends Doctor {
    public Surgeon(int id, String name, double fee) { super(id, name, fee); }
    protected double getAdditionalCharge() { return 1500; }
    public String getDoctorType() { return "Surgeon"; }
}
