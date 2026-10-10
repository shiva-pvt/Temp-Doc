class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String args[]) {
        Employee e1 = new Employee("Ravi", 30000);
        Employee e2 = new Employee("Kiran", 40000);

        e1.display();
        e2.display();
    }
}