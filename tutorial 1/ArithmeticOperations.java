class ArithmeticOperations {
    public static void main(String args[]) {
        int price1 = 250;
        int price2 = 100;

        int total = price1 + price2;
        int difference = price1 - price2;
        int product = price1 * price2;
        int quotient = price1 / price2;
        int remainder = price1 % price2;

        System.out.println("Price of Product 1 = " + price1);
        System.out.println("Price of Product 2 = " + price2);
        System.out.println("Total = " + total);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}