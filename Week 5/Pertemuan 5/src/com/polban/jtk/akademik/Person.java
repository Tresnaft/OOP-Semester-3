package com.polban.jtk.akademik;

abstract class Person {
    protected String nama;
    protected String jurusan;


    public Person(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Abstract method
    public abstract void displayInfo();

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

}
