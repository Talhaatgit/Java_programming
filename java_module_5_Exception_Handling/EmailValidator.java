import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your email: ");
            String email = sc.nextLine();

            // Check condition
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: '@' symbol missing!");
            }

            System.out.println("Valid Email Address!");
        }
        catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
