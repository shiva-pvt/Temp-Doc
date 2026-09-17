package tutorial6.scholarship;

import java.util.Scanner;

public class ScholarshipMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scholarship scholarship = new Scholarship(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        if (scholarship.isEligible()) {
            System.out.println("Eligible");
            System.out.println("Scholarship: " + scholarship.getScholarshipAmount());
        } else {
            System.out.println("Not Eligible");
        }
    }
}
