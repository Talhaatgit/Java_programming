// Demonstrates how reference variables work in memory

class Book {
    String title;
}

public class ClassObject_ReferenceExample {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";

        Book b2 = b1;   // b2 references same object as b1
        b2.title = "Advanced Java";

        System.out.println("b1 Title: " + b1.title);
        System.out.println("b2 Title: " + b2.title);
    }
}
