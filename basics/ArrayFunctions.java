import java.util.*;

public class ArrayFunctions {

    // 1. Count how many numbers are greater than 50
    static int countGreaterThan50(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 50) count++;
        }
        return count;
    }

    // 2. Print array in reverse order
    static void printReverse(int[] arr) {
        System.out.print("Array in reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 3. Print even numbers
    static void printEven(int[] arr) {
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();
    }

    // 4. Print odd numbers
    static void printOdd(int[] arr) {
        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();
    }

    // 5. Find maximum
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // 6. Find minimum
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // 7. Search for a number
    static boolean searchNumber(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // 8. Copy array
    static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    // 9. Swap first and last
    static void swapFirstLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    // 10. Count occurrences of a number
    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }

    // 11. Find index of a number
    static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // not found
    }

    // ---------------- MAIN -----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Menu-driven loop
        while (true) {
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Count numbers > 50");
            System.out.println("2. Print array in reverse order");
            System.out.println("3. Print even numbers");
            System.out.println("4. Print odd numbers");
            System.out.println("5. Find maximum element");
            System.out.println("6. Find minimum element");
            System.out.println("7. Search for a number");
            System.out.println("8. Copy array");
            System.out.println("9. Swap first and last element");
            System.out.println("10. Count occurrences of a number");
            System.out.println("11. Find index of a number");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Count > 50: " + countGreaterThan50(arr));
                    break;
                case 2:
                    printReverse(arr);
                    break;
                case 3:
                    printEven(arr);
                    break;
                case 4:
                    printOdd(arr);
                    break;
                case 5:
                    System.out.println("Maximum: " + findMax(arr));
                    break;
                case 6:
                    System.out.println("Minimum: " + findMin(arr));
                    break;
                case 7:
                    System.out.print("Enter number to search: ");
                    int search = sc.nextInt();
                    if (searchNumber(arr, search))
                        System.out.println(search + " exists in array.");
                    else
                        System.out.println(search + " not found.");
                    break;
                case 8:
                    int[] copy = copyArray(arr);
                    System.out.println("Copied array: " + Arrays.toString(copy));
                    break;
                case 9:
                    swapFirstLast(arr);
                    System.out.println("After swap: " + Arrays.toString(arr));
                    break;
                case 10:
                    System.out.print("Enter number to count: ");
                    int numToCount = sc.nextInt();
                    System.out.println(numToCount + " appears " + countOccurrences(arr, numToCount) + " times.");
                    break;
                case 11:
                    System.out.print("Enter number to find index: ");
                    int numToFind = sc.nextInt();
                    int idx = findIndex(arr, numToFind);
                    if (idx != -1)
                        System.out.println(numToFind + " found at index " + idx);
                    else
                        System.out.println(numToFind + " not found.");
                    break;
                case 12:
                    System.out.println("Exiting program...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

