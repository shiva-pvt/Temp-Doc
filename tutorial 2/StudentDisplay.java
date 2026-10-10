class StudentDisplay {
    String name = "Shiva";
    String rollNo = "RA251026010731";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String args[]) {
        StudentDisplay s = new StudentDisplay();
        s.display();
    }
}