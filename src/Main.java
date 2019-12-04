import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int v1=0;
        String str=scn.nextLine();
        String strArr[]=str.split(" ");
        for (int i=0;i<strArr.length;i++){
            v1=Integer.parseInt(strArr[i]);
            System.out.print(v1*v1+"\t");
        }
        System.out.println();
    }
}
