public class main {
    public static void main(String[] args) {

        // Employee test
        Employee e = new Employee();
        e.setName("Rahul");
        e.setSalary(45000);

        // Cellphone test
        Cellphone c = new Cellphone();
        c.ring();
        c.vibrate();
        c.callFriend();

        // Book class test
        Book b1 = new Book();
        Book b2 = new Book("Think and Grow Rich", "Napoleon Hill");
        Book b3 = new Book("Java Programming", "James Gosling", 499);

        // Cylinder using setters
        Cylinder cy1 = new Cylinder();
        cy1.setRadius(5);
        cy1.setHeight(10);

        System.out.println("\nCylinder 1 (using setters):");
        System.out.println("Radius: " + cy1.getRadius());
        System.out.println("Height: " + cy1.getHeight());
        System.out.println("Surface Area: " + cy1.surfaceArea());
        System.out.println("Volume: " + cy1.volume());

        // Cylinder using constructor
        Cylinder cy2 = new Cylinder(7, 14);

        System.out.println("\nCylinder 2 (using constructor):");
        System.out.println("Radius: " + cy2.getRadius());
        System.out.println("Height: " + cy2.getHeight());
        System.out.println("Surface Area: " + cy2.surfaceArea());
        System.out.println("Volume: " + cy2.volume());

        
    }
}
