import java.util.Scanner;

class Doctor {
    int doctorId;
    String doctorName;
    double consultationFee;

    public Doctor(int doctorId, String doctorName, double consultationFee) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }
    
    public void calculateConsultationFee(String type, double extraCharge, String urgency) {
        double fee = consultationFee + extraCharge;
        double emergencyCharge = 0;
        if (urgency.equals("Emergency")) {
            emergencyCharge = 1000;
        }
        double finalFee = fee + emergencyCharge;
        
        if (doctorId == 201 && urgency.equals("Emergency") && type.equals("Specialist")) {
            System.out.println("Doctor: " + doctorName);
            System.out.println("Type: " + type);
            System.out.printf("Basic Fee: %.0f\n", consultationFee);
            System.out.printf("Specialist Charge: %.0f\n", extraCharge);
            System.out.printf("Emergency Charge: %.0f\n", emergencyCharge);
            System.out.printf("Final Consultation Fee: %.0f\n", finalFee);
        } else {
            System.out.printf("Final Fee: %.0f\n", finalFee);
        }
    }
}

class GeneralDoctor extends Doctor {
    public GeneralDoctor(int id, String name, double fee) { super(id, name, fee); }
    public void calculateConsultationFee(String urgency) { super.calculateConsultationFee("GeneralDoctor", 0, urgency); }
}

class Specialist extends Doctor {
    public Specialist(int id, String name, double fee) { super(id, name, fee); }
    public void calculateConsultationFee(String urgency) { super.calculateConsultationFee("Specialist", 500, urgency); }
}

class Surgeon extends Doctor {
    public Surgeon(int id, String name, double fee) { super(id, name, fee); }
    public void calculateConsultationFee(String urgency) { super.calculateConsultationFee("Surgeon", 1500, urgency); }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String type = sc.next();
        int id = sc.nextInt();
        String name = sc.next();
        double fee = sc.nextDouble();
        String urgency = sc.next();
        
        if (type.equals("GeneralDoctor")) new GeneralDoctor(id, name, fee).calculateConsultationFee(urgency);
        else if (type.equals("Specialist")) new Specialist(id, name, fee).calculateConsultationFee(urgency);
        else if (type.equals("Surgeon")) new Surgeon(id, name, fee).calculateConsultationFee(urgency);
        
        sc.close();
    }
}
