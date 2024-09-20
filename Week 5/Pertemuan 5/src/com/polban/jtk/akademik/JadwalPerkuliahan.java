package com.polban.jtk.akademik;

public class JadwalPerkuliahan {
    private String hari;
    private String waktu;
    private String ruangan;
    private MataKuliah mataKuliah;
    private Dosen dosen;

    public JadwalPerkuliahan(String hari, String waktu, String ruangan, MataKuliah mataKuliah, Dosen dosen) {
        this.waktu = waktu;
        this.ruangan = ruangan;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.hari = hari;

    }

    public String getHari() {
        return hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getRuangan() {
        return ruangan;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

}
