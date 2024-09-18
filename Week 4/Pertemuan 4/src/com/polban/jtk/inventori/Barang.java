package com.polban.jtk.inventori;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah){
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah barang yang ditambah harus positif");
        }
    }
}