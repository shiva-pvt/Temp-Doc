class Patient {
    String name;
    double fee;

    Patient(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    void display(double discountRate) {
        double discount = fee * discountRate;
        double finalAmount = fee - discount;

        System.out.println("Patient Name : " + name);
        System.out.println("Original Fee : " + fee);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + finalAmount);
        System.out.println();
    }

    public static void main(String args[]) {
        Patient p[] = {
            new Patient("Shiva", 2500),
            new Patient("Arun", 1500),
            new Patient("Rahul", 3000),
            new Patient("Kiran", 1800),
            new Patient("Vijay", 2200)
        };

        for (Patient x : p) {
            double rate = x.fee >= 2000 ? 0.10 : 0.05;
            x.display(rate);
        }
    }
}