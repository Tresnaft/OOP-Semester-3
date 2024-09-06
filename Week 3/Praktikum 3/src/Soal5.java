import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String plat = input.nextLine();
        String angkaStr = plat.replaceAll("\\s", "");

        long angkaLong = Long.parseLong(angkaStr);
        angkaLong -= 999999;
//        angkaLong = angkaLong % 5;

        if ((angkaLong % 5) != 0){
            System.out.println("Berhenti");
        } else System.out.println("Jalan");

    }
}
