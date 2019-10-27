import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double a=scn.nextInt();
        double x=0;
        for(double i=1;i<=a;i++){
            x=x+Math.pow(2,i);
           }
        System.out.println(x);
        }
    }

