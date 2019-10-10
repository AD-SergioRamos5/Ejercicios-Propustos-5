import java.io.*;
import java.util.Scanner;

public class Ejercicio2
{
   public static void main(String [] args)
   {
      Scanner entrada;
      
      try
      {
         entrada = new Scanner(System.in);
         PrintWriter pw = new PrintWriter("Frases2.txt");
         
         System.out.print("Introduce una frase: ");
         String frase = entrada.nextLine();

         while(!frase.equals(""))
         {
            pw.println(frase);
            System.out.print("Introduce una frase: ");
            frase = entrada.nextLine();
         }
         
         pw.close();
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}