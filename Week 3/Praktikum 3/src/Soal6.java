import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
