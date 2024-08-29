import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner nilai = new Scanner(System.in);
        float nilaiTugas = nilai.nextFloat();
        float nilaiUAS = nilai.nextFloat();
        float nilaiUTS = nilai.nextFloat();
        nilaiAkhir nilaiAkhir = new nilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);

//        System.out.println("Input nilai tugas: ");
//        float nilaiTugas = nilai.nextFloat();
//        System.out.println("Nilai Tugas: " +nilaiTugas);
//
//        System.out.println("Input nilai UTS: ");
//        float nilaiUTS = nilai.nextFloat();
//        System.out.format("Nilai UTS: %.2f \n", nilaiUTS);
//
//        System.out.println("Input nilai UAS: ");
//        float nilaiUAS = nilai.nextFloat();
//        System.out.format("Nilai UAS: %.2f \n", nilaiUAS);
//
//        float nilaiAkhir = (nilaiTugas * 20/100) + (nilaiUTS * 35/100) + (nilaiUAS * 45/100);
//        System.out.format("Nilai Akhir: %.2f \n", nilaiAkhir);
//
//        char Grade;
//        if (nilaiAkhir >= 80){
//            Grade = 'A';
//        } else if (nilaiAkhir >= 75) {
//            Grade = 'B';
//        } else if (nilaiAkhir >= 65) {
//            Grade = 'C';
//        } else if (nilaiAkhir >= 49) {
//            Grade = 'D';
//        } else {
//            Grade = 'E';
//        }
//
//        System.out.println("Grade: " +Grade);
    }
}