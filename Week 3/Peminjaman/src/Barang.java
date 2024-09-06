public class Barang {
    private String namaBarang;
    private String kodeBarang;
    private Integer jumlahBarang;
    private String merkBarang;
    private String jenisBarang;

    public Barang(String namaBarang, String kodeBarang, Integer jumlahBarang, String merkBarang, String jenisBarang) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.jumlahBarang = jumlahBarang;
        this.merkBarang = merkBarang;
        this.jenisBarang = jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public Integer getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(Integer jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}

