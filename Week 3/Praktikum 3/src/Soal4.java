import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int itemTerjual = input.nextInt();
        int totalPenjualan = 50000 * itemTerjual;
        int gajiPokok = 500000;
        int gaji = 0;

        if (itemTerjual > 80) {
            gaji = (int) (gajiPokok + (0.35 * totalPenjualan));
        } else if (itemTerjual >= 40) {
            gaji = (int) (gajiPokok + (0.25 * totalPenjualan));
        } else if (itemTerjual < 15) {
            gaji = (int) (gajiPokok - (0.15 * (50000 * (15 - itemTerjual))));
        } else {
            gaji = (int) (gajiPokok + (0.1 * totalPenjualan));
        }
        System.out.println(gaji);

    }
}
