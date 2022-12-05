/*6.18 (Mostrar un cuadrado de asteriscos) Escriba un método llamado cuadradoDeAsteriscos que muestre un
cuadrado relleno (el mismo número de filas y columnas) de asteriscos cuyo lado se especifique en el parámetro entero
lado. Por ejemplo, si lado es 4, el método debe mostrar:
****
****
****
****
Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que introduzca el usuario, y
despliegue los asteriscos con el método cuadradoDeAsteriscos. */

import java.util.Scanner;

public class CuadradoAsterisco {

    Scanner teclado = new Scanner(System.in);

    int n;

    public void entradato() {
        System.out.print("Por favor ingrese lado del cuadrado: ");
        n = teclado.nextInt();
    }

    public void proceso() {
        if (n >= 2 && n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Por favor ingrese un numero entre 2 y 50");
        }
    }

    public static void main(String[] args) {
        CuadradoAsterisco fc = new CuadradoAsterisco();
        fc.entradato();
        fc.proceso();
    }
}