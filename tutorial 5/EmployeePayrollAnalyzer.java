import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void printNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.12 * basicSalary;
        double netSalary = basicSalary + hra + da - pf;
        if (basicSalary > 50000) {
            netSalary -= 2000;
        }
        System.out.printf("%d %s %.2f\n", employeeId, employeeName, netSalary);
    }
}

public class EmployeePayrollAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            emp.printNetSalary();
        }
        sc.close();
    }
}
