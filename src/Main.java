import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float a=scn.nextInt();
        float sum=1;
        for(float i=1;i<=a;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
