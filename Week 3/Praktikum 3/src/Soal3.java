import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String[] words = s.split(" ");

        switch (words[1]){
            case "+":
               System.out.println(Integer.parseInt(words[0]) + Integer. parseInt(words[2]));
               break;
            case "-":
                System.out.println(Integer.parseInt(words[0]) - Integer. parseInt(words[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(words[0]) * Integer. parseInt(words[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(words[0]) * Integer. parseInt(words[2]));
                break;
            case "%":
                System.out.println(Integer.parseInt(words[0]) % Integer. parseInt(words[2]));
                break;
        }
    }
}
