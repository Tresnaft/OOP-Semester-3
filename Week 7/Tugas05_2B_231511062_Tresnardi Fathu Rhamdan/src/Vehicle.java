abstract class Vehicle {
    protected String nama;
    protected int kecepatanMaksimum;

    public Vehicle(String nama, int kecepatanMaksimum) {
        this.nama = nama;
        this.kecepatanMaksimum = kecepatanMaksimum;
    }

    // Method Concrete
    public void displayInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaksimum + " km/h");
    }

    // Method Abstract
    public abstract void startEngine();
}
