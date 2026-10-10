class Marks {
    int m1 = 80, m2 = 75, m3 = 90;

    void calculate() {
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }

    public static void main(String args[]) {
        Marks m = new Marks();
        m.calculate();
    }
}