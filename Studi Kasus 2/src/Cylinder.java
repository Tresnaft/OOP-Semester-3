public class Cylinder extends Shape{
    double radius;
    double height;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
