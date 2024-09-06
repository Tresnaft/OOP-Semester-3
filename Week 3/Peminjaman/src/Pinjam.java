import java.util.Scanner;

public class Pinjam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaBarang = {"Proyektor Infocus", "Terminal Wattz", "Keyboard Wooting", "Mouse Razer"};
        String[] kodeBarang = {"P001", "T001", "K001", "M001"};
        Integer[] jumlahBarang = {10, 15, 20, 30};
        String[] merkBarang = {"Infocus", "Wattz", "Wooting", "Razer"};
        String[] jenisBarang = {"Proyektor", "Terminal", "Keyboard", "Mouse"};




        int pilihan;
        // Deklarasi array of object untuk menyimpan Barang
        Barang[] listBarang = new Barang[4];  // Array dengan ukuran 4

        // Mengisi array listBarang dengan objek Barang
        for (int i = 0; i < 4; i++) {
            listBarang[i] = new Barang(namaBarang[i], kodeBarang[i], jumlahBarang[i], merkBarang[i], jenisBarang[i]);
        }

        // Mengakses dan menampilkan nama barang dari tiap objek dalam array

        System.out.println("Silahkan masukkan identitas peminjam.");
        System.out.println("Nama  NIM  Kelas");

        Peminjam peminjam = new Peminjam(input.next(), input.next(), input.next());


        System.out.println("Barang-barang yang tersedia: ");
        System.out.format("Nama Barang \t Jumlah Barang \n");
        for (int i = 0; i < listBarang.length; i++) {
            System.out.format(i+1 + ". " + listBarang[i].getNamaBarang() + " \t "+listBarang[i].getJumlahBarang() + "\n");
        }

        for (int i = 0; i < 5; i++){
            System.out.println("Pilih barang yang ingin dipinjam:");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    listBarang[0].setJumlahBarang(listBarang[0].getJumlahBarang() - 1);
                    break;
                case 2:
                    listBarang[1].setJumlahBarang(listBarang[1].getJumlahBarang() - 1);
                    break;
                case 3:
                    listBarang[2].setJumlahBarang(listBarang[2].getJumlahBarang() - 1);
                    break;
                case 4:
                    listBarang[3].setJumlahBarang(listBarang[3].getJumlahBarang() - 1);
                    break;
                default:
                    System.out.println("Pilih 1-4");
            }

        }
        for (int j = 0; j < 5; j++){
            System.out.println("Barang-barang yang tersedia: ");
            System.out.format("Nama Barang \t Jumlah Barang \n");
            for (int i = 0; i < listBarang.length; i++) {
                System.out.format(i+1 + ". " + listBarang[i].getNamaBarang() + " \t "+listBarang[i].getJumlahBarang() + "\n");
            }
        }

    }
}