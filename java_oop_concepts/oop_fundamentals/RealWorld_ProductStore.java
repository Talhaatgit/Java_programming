// Real-world class to represent a product in online shopping

class Product {
    String name;
    double price;
    double rating;

    void setDetails(String n, double p, double r) {
        name = n;
        price = p;
        rating = r;
    }

    void showProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Rating: ⭐ " + rating);
    }
}

public class RealWorld_ProductStore {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();

        p1.setDetails("Laptop", 58000, 4.5);
        p2.setDetails("Wireless Earbuds", 2499, 4.2);

        p1.showProduct();
        p2.showProduct();
    }
}
