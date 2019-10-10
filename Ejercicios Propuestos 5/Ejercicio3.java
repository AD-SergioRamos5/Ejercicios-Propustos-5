import java.io.*;
import java.util.Scanner;

public class Ejercicio3
{
   public static void main(String [] args)
   {
      PrintWriter pW = null;
      Scanner entrada;
      
      try
      {
         entrada = new Scanner(System.in);
         pW = new PrintWriter(new BufferedWriter(new FileWriter("Frases3.txt",true)));
         
         System.out.print("Introduce una frase: ");
         String frase = entrada.nextLine();

         while(!frase.equals(""))
         {
            pW.println(frase);
            System.out.print("Introduce una frase: ");
            frase = entrada.nextLine();
         }
      }
      catch (IOException e)
      {
         System.out.println("Ha habido problemas: " + e.getMessage() );
      }
      finally
      {
         pW.close();
      }
   }
}