import java.util.Scanner;
public class numgrande {
    public static void main(String[] args) {
    int contador=0;
    int numero=0;
    int mayor=0;
    while(contador<10){
    System.out.println("Ingrese el numero"+" "+(contador+1));
    try (Scanner m = new Scanner(System.in)) {
        numero=m.nextInt();
    }
    contador++;
    if(numero>mayor){
    mayor=numero;
    }else
    mayor=+mayor;
    }
    System.out.print("El numero mayor es: "+mayor);
    }
}