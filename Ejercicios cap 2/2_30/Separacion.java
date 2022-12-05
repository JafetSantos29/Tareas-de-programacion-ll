import java.util.Scanner;

public class Separacion 
{
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner (System.in)) 
        {
            int numero;

            System.out.println("Escriba un numero de 5 digitos: ");
            numero = entrada.nextInt();
            

            System.out.printf("%d ",   numero/10000);
            System.out.printf("%d ", (numero%10000)/1000);
            System.out.printf("%d ", ((numero%10000)%1000)/100);
            System.out.printf("%d ", (((numero%10000)%1000)%100)/10);
            System.out.printf("%d\n ", ((((numero%10000)%1000)%100)%10));

        }
    }
}
