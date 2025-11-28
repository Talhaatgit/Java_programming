class Book {
    String title;
    int price;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {
    public String toString() {
        return "Car class: " + getClass().getName();
    }
}

class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student)o;
        return this.roll == s.roll;
    }

    public int hashCode() {
        return Integer.hashCode(roll);
    }
}

class Movie {
    String name;
    String genre;

    Movie(String n, String g) {
        name = n;
        genre = g;
    }

    public String toString() {
        return "Movie[name=" + name + ", genre=" + genre + "]";
    }
}

class Player {
    int age;

    Player(int a) {
        age = a;
    }

    public int hashCode() {
        return Integer.hashCode(age);
    }
}

public class ObjectMethodsDemo {
    public static void main(String[] args) {
        System.out.println(new Book("Java", 500));

        System.out.println(new Car());

        Student s1 = new Student(10);
        Student s2 = new Student(10);
        System.out.println("Students equal? " + s1.equals(s2));

        Movie m = new Movie("RRR", "Action");
        System.out.println(m);

        Player p = new Player(25);
        System.out.println("Player hash: " + p.hashCode());
    }
}
