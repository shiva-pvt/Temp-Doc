import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) return;
        double cgpa = sc.nextDouble();
        double attendance = sc.nextDouble();
        double income = sc.nextDouble();
        
        if (cgpa >= 8.5 && attendance >= 85 && income <= 500000) {
            if (cgpa >= 9.5) {
                System.out.println("Eligible Scholarship: 50000");
            } else if (cgpa >= 9.0) {
                System.out.println("Eligible Scholarship: 35000");
            } else if (cgpa >= 8.5) {
                System.out.println("Eligible Scholarship: 20000");
            }
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
