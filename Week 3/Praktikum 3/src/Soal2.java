import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] s = new String[3];
        int[] i = new int[3];

        for (int j = 0; j < s.length; j++){
            s[j] = input.next();
            i[j] = input.nextInt();
//            System.out.println(s[j] + i[j]);
        }

        System.out.println("==========================");
        for (int j = 0; j < s.length; j++){
            System.out.printf("%-15s %03d \n", s[j], i[j]);
        }
        System.out.println("==========================");
    }
}
