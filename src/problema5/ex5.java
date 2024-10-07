package problema5;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random random= new Random();
        int n=random.nextInt(20);
        System.out.println("n= " +n);
        int x=5*n*n+4, y=5*n*n-4;

        if(patrat_perect(x) || patrat_perect(y))
            System.out.println(n+ " apartine Fibonacci");
        else
            System.out.println(n+ " NU apartine Fibonacci");
    }

    public static boolean patrat_perect(int x)
    {
        double radacina= Math.sqrt(x);

        return (radacina==Math.floor(radacina));
    }
}
