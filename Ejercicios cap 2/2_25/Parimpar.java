import java.util.Scanner;

public class Parimpar 
{
    public static void main(String args[])
   { // Abre metodo main

      int numero;
      try (Scanner entrada = new Scanner(System.in)) 
     {
         System.out.print("\nIntroduzca un numero y sabra si es par o impar: ");
         numero = entrada.nextInt();
        } 
  
        if( 0 == numero % 2 )
        System.out.println("\nEl numero es par.");
  
        if ( 0 != numero % 2)
        System.out.println("\nEl numero es impar.");
    
     }        // Cierra el metodo main
}
