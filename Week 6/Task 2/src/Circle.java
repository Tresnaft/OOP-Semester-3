public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        // Creating a Circle object using the default constructor
        Circle circle1 = new Circle();
        System.out.println(circle1);  // Testing toString() for circle1
        System.out.println("Area: " + circle1.getArea());          // Testing getArea()
        System.out.println("Perimeter: " + circle1.getPerimeter()); // Testing getPerimeter()

        System.out.println(); // Just to add a space in output

        // Creating a Circle object with a specified radius
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2);  // Testing toString() for circle2
        System.out.println("Area: " + circle2.getArea());          // Testing getArea()
        System.out.println("Perimeter: " + circle2.getPerimeter()); // Testing getPerimeter()

        System.out.println(); // Just to add a space in output

        // Creating a Circle object with specified radius, color, and filled status
        Circle circle3 = new Circle(3.0, "red", true);
        System.out.println(circle3);  // Testing toString() for circle3
        System.out.println("Area: " + circle3.getArea());          // Testing getArea()
        System.out.println("Perimeter: " + circle3.getPerimeter()); // Testing getPerimeter()

        // Changing attributes of circle3
        circle3.setRadius(4.0);
        circle3.setColor("blue");
        circle3.setFilled(false);
        System.out.println("\nAfter modifying circle3 attributes:");
        System.out.println(circle3);  // Testing toString() after changes
        System.out.println("Area: " + circle3.getArea());          // Testing getArea() after changes
        System.out.println("Perimeter: " + circle3.getPerimeter()); // Testing getPerimeter() after changes
    }

}
