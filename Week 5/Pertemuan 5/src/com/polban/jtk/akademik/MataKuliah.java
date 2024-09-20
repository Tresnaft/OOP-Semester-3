package com.polban.jtk.akademik;

public class MataKuliah {
    private String namaMK;
    private String kodeMK;
    private String jenisMK;
    private Dosen pengampu;

    public MataKuliah(String namaMK, String kodeMK, Dosen pengampu, String jenisMK) {
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
        this.pengampu = pengampu;
        this.jenisMK = jenisMK;
    }

    public void displayInfo() {
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Jenis Mata Kuliah: " + jenisMK);
        System.out.println("com.polban.jtk.akademik.Dosen Pengampu: " + pengampu.getNama());
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getJenisMK() {
        return jenisMK;
    }

    public Dosen getPengampu() {
        return pengampu;
    }
}
