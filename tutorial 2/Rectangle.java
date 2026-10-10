class Rectangle {
    int length = 20;
    int breadth = 10;

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.area();
    }
}