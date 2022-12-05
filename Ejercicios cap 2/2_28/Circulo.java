import java.util.Scanner;

public class Circulo 
{
    public static void main(String [] args)
    {
        try (Scanner entrada = new Scanner (System.in)) 
        {
            int radio;
            int diametro;
            double circuferencia;
            double area;

            System.out.print("Escriba el diametro del circulo: ");
            radio = entrada.nextInt();

           diametro =  2*radio;
           circuferencia = 2*Math.PI*radio;
           area = Math.PI*radio*radio;
    
            System.out.printf("\nEl diametro del circulo es: %d", diametro);
            System.out.printf("\nEl perimetro del circulo es: %f", circuferencia);
            System.out.printf("\nEl area del circulo es: %f\n", area);



        }


    }
}
