package com.polban.jtk.akademik;

public class Mahasiswa extends Person {
    private String nim;
    private String prodi;
    private String kelas;

    public Mahasiswa(String nama, String kelas, String nim, String jurusan, String prodi) {
        super(nama, jurusan);
        this.nim = nim;
        this.kelas = kelas;
        this.prodi = prodi;

    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Kelas: " + kelas);
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public String getKelas() {
        return kelas;
    }
}
