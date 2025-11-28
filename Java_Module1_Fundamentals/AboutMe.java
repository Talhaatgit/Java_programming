import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter your favorite programming language: ");
        String language = sc.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Language: " + language);

        sc.close();
    }
}
