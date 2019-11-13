import java.util.Scanner;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BigInteger a=new BigInteger("1");
        int  b = 0;
        for (int i = n; i > 1; i--) {
            a=a.multiply(new BigInteger(Integer.toString(i)));
        }
        while (a.mod(new BigInteger("10")).intValue()==0){
            b++;
            a=a.divide(new BigInteger("10"));
        }
        System.out.println(b);
    }
}
