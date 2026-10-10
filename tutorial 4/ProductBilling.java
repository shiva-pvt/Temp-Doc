class Product {
    int id, quantity;
    String name;
    double price;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        double total = price * quantity;
        double discount = total >= 5000 ? total * 0.10 : total * 0.05;
        double finalPrice = total - discount;

        System.out.println("Product ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Total Price : " + total + " ₹");
        System.out.println("Discount : " + discount + " ₹");
        System.out.println("Final Price : " + finalPrice + " ₹");
        System.out.println();
    }

    public static void main(String args[]) {
        Product p[] = {
            new Product(101, "Laptop", 50000, 1),
            new Product(102, "Mouse", 800, 2),
            new Product(103, "Keyboard", 1500, 2),
            new Product(104, "Monitor", 7000, 1),
            new Product(105, "Headset", 2500, 2)
        };

        for (Product x : p)
            x.display();
    }
}