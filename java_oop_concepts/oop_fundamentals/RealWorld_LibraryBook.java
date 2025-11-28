// Real-world class to represent a library book record

class LibraryBook {
    String title;
    String author;
    boolean isAvailable;

    void addBook(String t, String a, boolean avail) {
        title = t;
        author = a;
        isAvailable = avail;
    }

    void showStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class RealWorld_LibraryBook {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook();
        b.addBook("Rich Dad Poor Dad", "Robert Kiyosaki", true);
        b.showStatus();
    }
}
