class TwoStudents {
    String name;
    int age;

    TwoStudents(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String args[]) {
        TwoStudents s1 = new TwoStudents("Shiva", 19);
        TwoStudents s2 = new TwoStudents("Rahul", 18);

        s1.display();
        s2.display();
    }
}