import java.util.Scanner;

public class Enteromenorymayor 
{
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) 
        {
            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;

            System.out.println("Primer entero:");
            numero1 = entrada.nextInt();

            System.out.println("Segundo entero:");
            numero2 = entrada.nextInt();

            System.out.println("Tercer entero:");
            numero3 = entrada.nextInt();

            System.out.println("Cuarto entero:");
            numero4 = entrada.nextInt();

            System.out.println("Quinto entero:");
            numero5 = entrada.nextInt();

            int menor = numero1;

            if (numero2<menor)
            menor = numero2;
            if (numero3<menor)
            menor = numero3;
            if (numero4<menor)
            menor = numero4;
            if (numero5<menor)
            menor = numero5;


            int mayor = numero1;

            if (numero2>mayor)
            mayor = numero2;
            if (numero3>mayor)
            mayor = numero3;
            if (numero4>mayor)
            mayor = numero4;
            if (numero5>mayor)
            mayor = numero5;

            System.out.printf("El menor de los numeros es: %d%n", menor);
            System.out.printf("El mayor de los numeros es: %d%n", mayor);
        

        }

    }
}
