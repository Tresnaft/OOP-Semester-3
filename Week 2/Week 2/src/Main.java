import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalInput = input.nextInt();
//        System.out.println("Inputnya: " + totalInput);
        double[] bilangan = new double[totalInput];

        for (int i = 0; i < totalInput; i++ ){
            bilangan[i] = input.nextDouble();
        }

        for (double bil : bilangan){
            System.out.format("Bilangan: %.1f bisa masuk ke dalam: \n", bil);
            if (bil >= Byte.MIN_VALUE && bil <= Byte.MAX_VALUE){
                System.out.println("Byte");
            }
            if (bil >= Short.MIN_VALUE && bil <= Short.MAX_VALUE){
                System.out.println("Short");
            }
            if (bil >= Integer.MIN_VALUE && bil <= Integer.MAX_VALUE){
                System.out.println("Integer");
            }
            if (bil >= Long.MIN_VALUE && bil <= Long.MAX_VALUE){
                System.out.println("Long");
            } else System.out.println("Tidak bisa masuk");
        }
    }
}