public class Soal2 {
    public static void main(String[] args){
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}

// output dari program ini adalah "everything"
// proses di atas menggunakan ternary operator atau operasi if-else secara singkat
// Syntaxnya, variable = (kondisi) ? jikaTrue : jikaFalse;
// dalam kasus ini, variable = (kondisi1) ? jikaTrue: (kondisi2) ? jikaTrue : jikaFalse;
// disini operasi yang dilakukan ketika variable tidak memenuhi kondisi1 adalah memeriksa apakah
// variabel tersebut memenuhi kondisi2.

// Ref: www.w3schools.com
