import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
        float a=scn.nextInt();
        float Max=a;
        float min=a;
        for(int i=1;i<10;i++){
           a=scn.nextFloat();
           if(Max<a){
               Max=a;
           }
           else if(min>a){
               min=a;
           }
        }
        System.out.printf("Max=%.2f\n",Max);
        System.out.printf("min=%.2f\n",min);
    }
}
