import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double a=scn.nextInt();
        double sum=0;
        for(double i=1;i<=a;i++){
            sum=sum+1/((2*i-1)*(2*i));
        }
        System.out.println(sum);
    }
}
