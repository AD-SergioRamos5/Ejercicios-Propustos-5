import java.io.*;
import java.util.Scanner;

public class Ejercicio1
{
   public static void main(String [] args)
   {
      PrintWriter pW = null;
      Scanner entrada;
      try
      {
         entrada = new Scanner(System.in);
         System.out.print("Introduce una frase: ");
         String frase1 = entrada.nextLine();      
         
         System.out.print("Introduce otra frase: ");
         String frase2 = entrada.nextLine();
         
         pW = new PrintWriter(new BufferedWriter(new FileWriter("Frases1.txt",true)));
         
         pW.println(frase1);
         pW.println(frase2);
       }
       catch (IOException e)
       {
         System.out.println("Ha habido problemas: " + e.getMessage() );
       }      
       finally
       {
         if(pW != null)
         {
            pW.close();
         }
       }
   }
}