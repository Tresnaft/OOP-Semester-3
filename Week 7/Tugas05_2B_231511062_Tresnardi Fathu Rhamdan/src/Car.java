class Car extends Vehicle implements Refuelable {
    public Car(String nama, int kecepatanMaksimum) {
        super(nama, kecepatanMaksimum);
    }

    @Override
    public void startEngine() {
        System.out.println("Mesin mobil " + nama + " dinyalakan.");
    }

    @Override
    public void refuel() {
        System.out.println("Mobil " + nama + " sedang diisi bahan bakar.");
    }
}