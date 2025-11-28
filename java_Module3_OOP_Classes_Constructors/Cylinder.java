class Cylinder {
    private double radius;
    private double height;

    // Getters
    public double getRadius() { 
        return radius; 
    }

    public double getHeight() { 
        return height; 
    }

    // Setters
    public void setRadius(double radius) { 
        this.radius = radius; 
    }

    public void setHeight(double height) { 
        this.height = height; 
    }

    // Surface area: 2πr(r + h)
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Volume: πr^2h
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Default constructor
    Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

    // Parameterized constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
}
