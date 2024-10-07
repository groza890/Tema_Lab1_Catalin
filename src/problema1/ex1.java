package problema1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int perimetru, aria;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lungime= ");
        int lungime= scanner.nextInt();
        System.out.print("Latime= ");
        int latime= scanner.nextInt();
        scanner.close();
        perimetru=2*lungime+2*latime;
        aria=lungime*latime;
        System.out.println("Aria= " + aria);
        System.out.println("Perimetru= " + perimetru);
    }
}
