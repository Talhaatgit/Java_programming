import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");
        names.add("Kiran");
        names.add("Riya");

        names.remove("Amit");

        System.out.println("Final List: " + names);
    }
}
