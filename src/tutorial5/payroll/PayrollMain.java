package tutorial5.payroll;

import java.util.Scanner;

public class PayrollMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Employee employee = new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble());
            employee.display();
        }
    }
}
