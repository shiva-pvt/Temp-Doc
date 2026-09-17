package college.management;

import college.management.course.Course;
import college.management.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1001, "Anita Sharma", "Computer Science", "anita@example.com");
        Course course = new Course("CS301", "Object-Oriented Programming", 4, "Dr. Rao");

        System.out.println("--- Student Information ---");
        student.display();
        System.out.println("\n--- Course Information ---");
        course.display();
    }
}
