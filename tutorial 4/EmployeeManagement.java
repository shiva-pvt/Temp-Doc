class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        double annual = salary * 12;
        double bonus = salary >= 30000 ? annual * 0.10 : 0;

        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Monthly Salary : " + salary);
        System.out.println("Annual Salary : " + annual);
        System.out.println("Bonus : " + bonus);
        System.out.println("Eligibility : " +
                (bonus > 0 ? "Eligible" : "Not Eligible"));
        System.out.println();
    }

    public static void main(String args[]) {
        Employee e[] = {
            new Employee(101, "Ravi", 35000),
            new Employee(102, "Arun", 25000),
            new Employee(103, "Kiran", 40000),
            new Employee(104, "Vijay", 28000),
            new Employee(105, "Rahul", 30000)
        };

        for (Employee x : e)
            x.display();
    }
}