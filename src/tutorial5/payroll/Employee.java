package tutorial5.payroll;

public class Employee {
    private final int employeeId;
    private final String employeeName;
    private final double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;
        double professionalTax = basicSalary > 50000 ? 2000 : 0;
        return basicSalary + hra + da - pf - professionalTax;
    }

    public void display() {
        System.out.printf("%d %s %.2f%n", employeeId, employeeName, calculateNetSalary());
    }
}
