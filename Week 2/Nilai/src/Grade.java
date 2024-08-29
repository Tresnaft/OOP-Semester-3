public class nilaiAkhir {
    float nilaiUTS;
    float nilaiTugas;
    float nilaiUAS;

    // Constructor
    public nilaiAkhir(float nilaiTugas, float nilaiUTS, float nilaiUAS){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Print
    public printNilai(){
        System.out.format("Nilai Tugas: %.2f \n", nilaiTugas);

    }
}
