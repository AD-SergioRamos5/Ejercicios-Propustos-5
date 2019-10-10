import java.io.*;
import java.util.Scanner;

public class Ejercicio7
{
   public static void main(String [] args)
   {
      Scanner entrada;
      PrintWriter pW = null;
      
      try
      {
         entrada = new Scanner(System.in);
         
         System.out.print("Introduce el nombre del mes: ");
         String nombreMes = entrada.nextLine(); 
         String cadena;
         
         pW = new PrintWriter("Calendario"+nombreMes+".txt");
      
         String[] dias = {"lun","mar","mie","jue","vie","sab","dom"};
         
         System.out.print("Introduce la cantidad de dias de un mes: ");
         int diasMes = entrada.nextInt();
         
         System.out.print("Introduce el numero del primer dia (1 Lunes - 7 Domingo): ");
         int primerDia = entrada.nextInt();
         
         pW.println("----------");
         pW.println(nombreMes);         
         pW.println("----------");        
         
         int contador = primerDia;
         
         for(int i = 0; i < 7; i++)
            pW.print(dias[i]+" ");
         
         for(int i = 0; i < diasMes; i++)
         {
            if(contador > 7)
               pW.print(cadena);
            
            for(int j = 0; j < contador; j++)
               cadena += "    ";
            
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