package tutorial6.scholarship;

public class Scholarship {
    private final double cgpa;
    private final double attendance;
    private final double familyIncome;

    public Scholarship(double cgpa, double attendance, double familyIncome) {
        this.cgpa = cgpa;
        this.attendance = attendance;
        this.familyIncome = familyIncome;
    }

    public boolean isEligible() {
        return cgpa >= 8.5 && attendance >= 85 && familyIncome <= 500000;
    }

    public int getScholarshipAmount() {
        if (!isEligible()) {
            return 0;
        }
        if (cgpa >= 9.5) return 50000;
        if (cgpa >= 9.0) return 35000;
        return 20000;
    }
}
