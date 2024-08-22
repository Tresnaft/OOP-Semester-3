public class Soal1 {
    public static void main (String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);

        System.out.println("Hasil 1 "+hasil);
    }
}

// outputnya adalah -125.
// variable byte menampung bilangan bulat dari -128 sampai 127
// karena 125 + 6 = 131 atau 127 lebih 4, sisanya akan ditambahkan ke -128
// sehingga -128 + 4 = -125

// Ref: www.w3schools.com
