package college.management;
import college.management.student.Student;
import college.management.course.Course;
public class Main {
    public static void main(String[] args) {
        Student s = new Student(1, "Alice");
        Course c = new Course(101, "Java Programming");
        s.display();
        c.display();
    }
}
