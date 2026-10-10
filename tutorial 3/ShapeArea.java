class ShapeArea {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }

    public static void main(String args[]) {
        ShapeArea s = new ShapeArea();

        s.area(5);
        s.area(10, 20);
        s.area(7.0);
    }
}