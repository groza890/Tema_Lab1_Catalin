package problema4;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random random= new Random();

        int x=random.nextInt(30);
        int y=random.nextInt(30);

        System.out.println("x=" +x);
        System.out.println("y=" +y);

       while(x!=y)
       {
           if(x>y)
               x=x-y;
           else
               y=y-x;
       }
        System.out.println("cmmdc este " +x);
    }
}
