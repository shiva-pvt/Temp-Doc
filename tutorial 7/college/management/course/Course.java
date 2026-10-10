package college.management.course;
public class Course {
    private int courseId;
    private String courseName;
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public void display() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }
}
