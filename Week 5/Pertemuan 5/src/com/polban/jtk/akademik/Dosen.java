package com.polban.jtk.akademik;

public class Dosen extends Person {
    private String kode_dosen;

    public Dosen(String nama, String jurusan, String kode_dosen) {
        super(nama, jurusan);
        this.kode_dosen = kode_dosen;
    }

    public String getKode_dosen() {
        return kode_dosen;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Kode com.polban.jtk.akademik.Dosen: " + kode_dosen);
    }


}
