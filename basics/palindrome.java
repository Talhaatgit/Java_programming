import java.util.*; // Import Scanner class

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Enter a string to check if it is a palindrome or not : ");
        String str = sc.nextLine(); // Read input string from user

        char[] str1 = new char[str.length()]; // Create char array to store reversed string
        int j = 0;

        // Loop through string from end to start and store characters in str1
        for (int i = str.length() - 1; i >= 0; i--) {
            str1[j] = str.charAt(i);
            j++;
        }

        String str2 = new String(str1); // Convert reversed char array to string

        // Check if original string is equal to reversed string
        if (str.equals(str2)) {
            System.out.println("Entered string is palindrome ");
        } else {
            System.out.println("Entered string is not a palindrome ");
        }
    }
}
