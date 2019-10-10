import java.io.*;
import java.util.Scanner;

public class Ejercicio6
{
   public static void main(String [] args)
   {
      
      PrintWriter pW = null;
      Scanner entrada;
      try
      {
         entrada = new Scanner(System.in);  
         String SEPARACION = "-------------------------------------";
         
         System.out.print("Introduce el nombre del mes: ");
         String nombreMes = entrada.nextLine(); 
         
         pW = new PrintWriter("Agenda"+nombreMes+".txt");
      
         String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
         
         System.out.print("Introduce la cantidad de dias de un mes: ");
         int diasMes = entrada.nextInt();
         
         System.out.print("Introduce el numero del primer dia (1 Lunes - 7 Domingo): ");
         int primerDia = entrada.nextInt();
           
         pW.println(nombreMes);
         pW.println(SEPARACION);
         
         int contador = primerDia;
         for(int i = 1; i <= diasMes; i++)
         {            
            pW.println(i + " " + dias[contador-1]);
            pW.println(SEPARACION);
            contador++;
            
            if(contador > 7)
               contador = 1;
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