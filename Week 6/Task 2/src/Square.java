public class Square extends Rectangle {
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        // Creating a Square object using the default constructor
        Square square1 = new Square();
        System.out.println(square1);  // Testing toString() for square1
        System.out.println("Area: " + square1.getArea());          // Testing getArea() from Rectangle
        System.out.println("Perimeter: " + square1.getPerimeter()); // Testing getPerimeter() from Rectangle

        System.out.println(); // Just to add a space in output

        // Creating a Square object with a specified side
        Square square2 = new Square(4.0);
        System.out.println(square2);  // Testing toString() for square2
        System.out.println("Area: " + square2.getArea());          // Testing getArea() from Rectangle
        System.out.println("Perimeter: " + square2.getPerimeter()); // Testing getPerimeter() from Rectangle

        System.out.println(); // Just to add a space in output

        // Creating a Square object with specified side, color, and filled status
        Square square3 = new Square(3.0, "green", true);
        System.out.println(square3);  // Testing toString() for square3
        System.out.println("Area: " + square3.getArea());          // Testing getArea() from Rectangle
        System.out.println("Perimeter: " + square3.getPerimeter()); // Testing getPerimeter() from Rectangle

        // Changing attributes of square3
        square3.setSide(5.0);
        square3.setColor("yellow");
        square3.setFilled(false);
        System.out.println("\nAfter modifying square3 attributes:");
        System.out.println(square3);  // Testing toString() after changes
        System.out.println("Area: " + square3.getArea());          // Testing getArea() after changes
        System.out.println("Perimeter: " + square3.getPerimeter()); // Testing getPerimeter() after changes
    }
}
