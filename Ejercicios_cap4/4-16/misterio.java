//Ejercicio 4.16: Misterio.java
public class misterio{
    public static void main(String[] args) {
        int x=1;
        int total=0;

        while(x<=10)
        {
            int y=x*x;
            System.out.println(y);
            total +=y;
            ++x;
        }
        System.out.printf("El total es %d%n", total);
    }
}//fin de la clase misterio

//Imprime una serie de 10 números desde el 1 hasta el 100, empezando en 1 y sumando el numero
//primo siguiente dentro del rango.