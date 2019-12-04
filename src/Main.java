import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random rand=new Random();
        rand.setSeed(23323456);
        int i=0;
        int data[]=new int[6];
        while (i<6){
            boolean flag=true;
            data[i]=rand.nextInt(42)+1;
            for (int j=0;j<i;j++){
                if (data[i]==data[j]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.print(data[i]+"\t");
                i++;
            }
        }
        System.out.println();

    }
}
