class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        System.out.println("Default Constructor Called");
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        printDetails();
    }

    // Constructor: title + author
    Book(String title, String author) {
        System.out.println("Constructor with title and author Called");
        this.title = title;
        this.author = author;
        this.price = 0.0;
        printDetails();
    }

    // Constructor: title + author + price
    Book(String title, String author, double price) {
        System.out.println("Constructor with all fields Called");
        this.title = title;
        this.author = author;
        this.price = price;
        printDetails();
    }

    void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}
