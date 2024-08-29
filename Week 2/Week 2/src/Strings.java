import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kata pertama: ");
        String word1 = input.nextLine();
        System.out.println("Masukkan kata kedua: ");
        String word2 = input.nextLine();

        int jumlahKata = word1.length() + word2.length();
        System.out.println("Jumlah huruf: " + jumlahKata);

        if (word1.compareTo(word2) > 0){
            System.out.println("Yes");
        } else System.out.println("No");

        word1 = word1.toUpperCase();
        word1 = word1.charAt(0) + word1.substring(1).toLowerCase();
        word2 = word2.toUpperCase();
        word2 = word2.charAt(0) + word2.substring(1).toLowerCase();

        System.out.println(word1 + " " + word2);
    }

}
