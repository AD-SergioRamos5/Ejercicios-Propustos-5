import java.io.*;
import java.util.Scanner;

public class Ejercicio5
{
   public static void main(String [] args)
   {
      PrintWriter pW = null;
      Scanner entrada;
      
      try
      {
         entrada = new Scanner(System.in);
         pW = new PrintWriter("rectangulo.txt");
         String cadena;
         
         System.out.print("Introduce una anchura: ");
         int anchura = entrada.nextInt();
         System.out.print("Introduce una altura: ");
         int altura = entrada.nextInt();
         
          for(int i = 1; i <= altura; i++)
          {
            cadena = "";
            for(int z = 1; z <= anchura; z++)
            {
               cadena += "*";
            }
            pW.println(cadena);
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