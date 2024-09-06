import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.replaceAll("[^a-zA-Z]", " ");
//        System.out.println(s);
        String[] filteredString = s.split(" ");

        int token = filteredString.length;

        System.out.println(token);

        for (String tokens : filteredString){
            System.out.println(tokens);
        }

    }
}