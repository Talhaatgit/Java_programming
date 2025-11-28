import java.util.Scanner;

public class NameToIntegerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);
            int number = Integer.parseInt(firstThree);

            System.out.println("Converted integer: " + number);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must contain at least 3 characters!");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: First three characters are not digits!");
        }
    }
}
