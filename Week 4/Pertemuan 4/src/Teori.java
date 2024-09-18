import static java.lang.System.*;

public class Teori {
    public static void main(String[] args) {

        // Inheritance
        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        out.println(myCar.brand + " " + myCar.modelName);
    }
}
