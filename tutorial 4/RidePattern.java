class Ride {
    int number;
    String name;

    Ride(int number, String name) {
        this.number = number;
        this.name = name;
    }

    void display() {
        System.out.print(name + " : ");

        for (int i = 1; i <= number; i++)
            System.out.print("*");

        System.out.println();
    }

    public static void main(String args[]) {
        Ride r[] = {
            new Ride(1, "Roller Coaster"),
            new Ride(2, "Ferris Wheel"),
            new Ride(3, "Bumper Cars"),
            new Ride(4, "Water Ride"),
            new Ride(5, "Haunted House")
        };

        for (Ride x : r)
            x.display();
    }
}