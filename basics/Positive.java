import java.util.*;   // Importing the Scanner class from java.util package

// Class to check if a number is positive, negative, or zero
class positive {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number to test positivity : ");
        
        // Read the integer entered by the user
        int num = sc.nextInt();
        
        // Check if the number is positive
        if (num > 0) {
            System.out.println("The entered number is positive");
        }
        // Check if the number is zero
        else if (num == 0) {
            System.out.println("The entered number is zero (neither positive nor negative)");
        }
        // If it is not positive or zero, then it must be negative
        else {
            System.out.println("The entered number is negative");
        }
    }
}