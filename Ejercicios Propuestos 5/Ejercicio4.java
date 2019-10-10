import java.io.*;
import java.util.Scanner;
import java.time.format.*;
import java.time.*;

public class Ejercicio4 
{
   public static void main(String [] args)
   {
      PrintWriter pW = null;
      Scanner entrada;
      
      try
      {
         entrada = new Scanner(System.in);
         pW = new PrintWriter(new BufferedWriter(new FileWriter("Frases4.txt",true)));
         
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");
         
         System.out.print("Introduce una frase (Intro para terminar): ");
         String frase = entrada.nextLine();

         while(!frase.equals(""))
         {
            LocalDateTime now = LocalDateTime.now();
            pW.write(dtf.format(now));
            pW.println(frase);
            
            System.out.print("Introduce una frase (Intro para terminar): ");
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