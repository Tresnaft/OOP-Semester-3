public class Motorcycle extends Vehicle implements Refuelable{
    public Motorcycle(String nama, int kecepatanMaksimum) {
        super(nama, kecepatanMaksimum);
    }

    @Override
    public void startEngine() {
        System.out.println("Mesin motor " + nama + " dinyalakan.");
    }

    @Override
    public void refuel() {
        System.out.println("Motor " + nama + " sedang diisi bahan bakar.");
    }


















    public static void main(String[] args) {
        // Membuat objek mobil
        Car car = new Car("Toyota Avanza", 180);
        car.displayInfo();
        car.startEngine();
        car.refuel();

        System.out.println(); // Pemisah output

        // Membuat objek motor
        Motorcycle motorcycle = new Motorcycle("Honda Vario", 120);
        motorcycle.displayInfo();
        motorcycle.startEngine();
        motorcycle.refuel();
    }
}
