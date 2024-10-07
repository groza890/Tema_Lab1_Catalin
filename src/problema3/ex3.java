package problema3;

import java.util.Scanner;

import static java.lang.System.*;

public class ex3 {
    public static void main(String[] args) {
        int x=0;
        Scanner scanner=new Scanner(in);
        out.print("n=");
        int n= scanner.nextInt();
        out.print("Divizorii sunt: ");
        scanner.close();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0) {
                out.print(i + " ");
                x++;
            }
        }
        if(x==2)
            out.println("Numarul " + n + " este prim");
    }
}
