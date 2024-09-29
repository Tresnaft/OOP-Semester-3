public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }
    /** Constructor Circle with color */
    public Circle(double r, String color){
        this.radius = r;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of
     Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}
