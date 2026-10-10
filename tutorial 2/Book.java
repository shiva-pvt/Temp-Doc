class Book {
    String title = "Java Programming";
    String author = "James Gosling";
    double price = 450;

    public static void main(String args[]) {
        Book b = new Book();

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
    }
}