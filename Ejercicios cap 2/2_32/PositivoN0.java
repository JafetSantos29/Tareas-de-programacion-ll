import java.util.Scanner;

public class PositivoN0 
{
    public static void main(String args[])
    {
        try (Scanner entrada = new Scanner (System.in)) 
        {
            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;

            System.out.println("INGRESE 5 NUMEROS PARA PODER DETERMINAR CUALES SON: NEGATIVOS, POSITIVOS Y CERO");

            System.out.println("Introduzca el primer numero ");
            numero1 = entrada.nextInt();

            System.out.println("Introduzca el segundo numero ");
            numero2 = entrada.nextInt();

            System.out.println("Introduzca el tercer numero ");
            numero3 = entrada.nextInt();

            System.out.println("Introduzca el cuarto numero ");
            numero4 = entrada.nextInt();

            System.out.println("Introduzca el quinto numero ");
            numero5 = entrada.nextInt();

            int positivos = 0;
            int negativos = 0;
            int ceros = 0; 

            if ( numero1 > 0)
            positivos = positivos + 1;
  
            if ( numero1 < 0)
            negativos = negativos + 1;
  
            if ( 0 == numero1)
            ceros = ceros + 1;
  
            if ( numero2 > 0)
            positivos = positivos + 1;
  
            if ( numero2 < 0)
            negativos = negativos + 1;
  
            if ( 0 == numero2)
            ceros = ceros + 1;
  
            if ( numero3 > 0)
            positivos = positivos + 1;
  
            if ( numero3 < 0)
            negativos = negativos + 1;
  
            if ( 0 == numero3)
            ceros = ceros + 1;
  
            if ( numero4 > 0)
            positivos = positivos + 1;
  
            if ( numero4 < 0)
            negativos = negativos + 1;
  
            if ( 0 == numero4)
            ceros = ceros + 1;
  
            if ( numero5 > 0)
            positivos = positivos + 1;
  
            if ( numero5 < 0)
            negativos = negativos + 1;
  
            if ( 0 == numero5)
            ceros = ceros + 1;

            System.out.printf("\nDe los numeros introducidos, %d son positivos, %d son negativos y %d son ceros\n", positivos, negativos, ceros);
        }

    
    }
    

}
