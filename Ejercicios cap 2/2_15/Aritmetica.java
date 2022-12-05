// CALCULADORA
// EJERCICIO 2.15 

import java.util.Scanner; //importamos la bibliote o clases

public class Aritmetica //declaracion de la clase
{
    public static void main(String[] args)
    { //declaracion de variable objeto
        try (Scanner entrada = new Scanner(System.in)) 
        
        { //declaracion de variables para almacenar
            int numero1;
            int numero2;
            int suma;
            int producto;
            int diferencia;
            int divicion;

            System.out.print("Introduzca el primer numero: "); //indicador
            numero1 = entrada.nextInt(); //lee el dato introducido por el usuario

            System.out.print("introduzca el segundo numero: ");
            numero2 = entrada.nextInt();

            suma = numero1 + numero2;   //se efectuan la operaciones
            diferencia = numero1 % numero2;
            producto = numero1 - numero2;
            divicion = numero1 / numero2;
      

           //muestra los resultados 
            System.out.printf(" La suma es:  %d%n", suma); 
            System.out.printf(" El producto es:  %d%n", diferencia);
            System.out.printf(" La diferencia o resta es: %d%n", producto);
            System.out.printf(" La divicion es %d%n", divicion);
        }

    }//fin del metodo main
}//fin de la clase
