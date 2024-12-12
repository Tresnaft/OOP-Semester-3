public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return super.toString() + " length " + length + " and width " + width;
    }
}
