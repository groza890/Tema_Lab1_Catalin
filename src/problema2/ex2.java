package problema2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int suma=0, min=10, max=0, x=0;

        try(Scanner scanner=new Scanner(new File("C:\\Users\\paul_\\OneDrive\\Documente\\Faculta\\Anul3\\Programare Java\\Tema_Lab1\\src\\problema2\\in.txt")))
        {
            while(scanner.hasNext())
            {
                int nr= scanner.nextInt();
                suma=suma+nr;
                if(min>nr) min=nr;
                if(max<nr) max=nr;
                x++;
            }
        }catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try
        {
            FileWriter writer= new FileWriter("C:\\Users\\paul_\\OneDrive\\Documente\\Faculta\\Anul3\\Programare Java\\Tema_Lab1\\src\\problema2\\out.txt");
            writer.write("suma:"+suma+"\n");
            writer.write("min:"+min+"\n");
            writer.write("max:"+max+"\n");
            writer.write("media:"+(float)suma/x+"\n");
            writer.close();
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
