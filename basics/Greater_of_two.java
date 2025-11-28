import java.util.*;  // Importing utility package to use Scanner class for input

// Class to check which of the two numbers is greater
public class Greater_of_two {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter two numbers
        System.out.println("Enter two numbers to check greater one : ");

        // Reading two integer inputs from the user
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Checking if first number is greater than second number
        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        // Checking if both numbers are equal
        else if(num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }
        // If above conditions are false, second number is greater
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}