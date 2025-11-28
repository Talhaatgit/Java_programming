// A simple Java program to demonstrate
// declaration and initialization of an array
public class array_declaration {
    public static void main(String[] args) {
        
        // Declare and create an integer array of size 10
        int[] arr = new int[10];
        
        // Initialize the array elements (hardcoded values)
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        
        // Print the 5th element of the array
        // Note: Array indexing starts from 0, so arr[4] is the 5th element
        System.out.println("The hardcoded array's 5th element is " + arr[4]);
    }
}
