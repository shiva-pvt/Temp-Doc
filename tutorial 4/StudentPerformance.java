class Student {
    int roll;
    String name;
    int marks[] = new int[3];
    double attendance;

    Student(int r, String n, int m1, int m2, int m3, double a) {
        roll = r;
        name = n;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        attendance = a;
    }

    void display() {
        int total = 0;

        for (int i = 0; i < 3; i++)
            total += marks[i];

        double avg = total / 3.0;
        String result = avg >= 50 ? "Pass" : "Fail";
        String scholarship = avg >= 75 && attendance >= 80
                             ? "Eligible" : "Not Eligible";
        String performance = avg >= 85 ? "Excellent" : "Good";

        System.out.println("Roll No : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);
        System.out.println("Result : " + result);
        System.out.println("Scholarship : " + scholarship);
        System.out.println("Performance : " + performance);
        System.out.println();
    }

    double average() {
        int total = 0;
        for (int m : marks)
            total += m;
        return total / 3.0;
    }

    public static void main(String args[]) {
        Student s[] = {
            new Student(101, "Shiva", 90, 85, 88, 90),
            new Student(102, "Arun", 70, 75, 72, 85),
            new Student(103, "Rahul", 60, 55, 65, 75),
            new Student(104, "Kiran", 45, 50, 40, 80),
            new Student(105, "Vijay", 80, 82, 85, 88)
        };

        int highest = 0;

        for (int i = 0; i < s.length; i++) {
            s[i].display();

            if (s[i].average() > s[highest].average())
                highest = i;
        }

        System.out.println("Highest Average Student:");
        System.out.println(s[highest].name + " - " + s[highest].average());
    }
}