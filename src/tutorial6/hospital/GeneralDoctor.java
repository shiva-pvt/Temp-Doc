package tutorial6.hospital;

public class GeneralDoctor extends Doctor {
    public GeneralDoctor(int id, String name, double fee) { super(id, name, fee); }
    protected double getAdditionalCharge() { return 0; }
    public String getDoctorType() { return "GeneralDoctor"; }
}
