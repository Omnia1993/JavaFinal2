import java.util.Scanner;

public class Question_7 {
    static int n, m;
   static  String x = "";
   static  int a;

    public static void main(String[] args) {
        int s = Utils.getNumber("Enter num ");
        IntToBin(s);
        System.out.println(x);

    }
    static String IntToBin(int z) {

        while (n > 0) {
           a = n % 2;
            x = a + x;
            n = n / 2;


        }
        return x;
    }
}