import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();

        int i = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Integer after casting: " + i);

        sc.close();
    }
}
