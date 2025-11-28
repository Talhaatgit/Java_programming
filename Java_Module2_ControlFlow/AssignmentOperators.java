import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        num += 5;
        System.out.println("After += : " + num);
        num -= 2;
        System.out.println("After -= : " + num);
        num *= 3;
        System.out.println("After *= : " + num);

        sc.close();
    }
}

