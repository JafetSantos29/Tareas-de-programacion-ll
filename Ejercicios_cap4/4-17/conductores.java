//(Kilometraje de gasolina) Los conductores se preocupan por el kilometraje de sus automóviles. Un conductor
//ha llevado el registro de varios reabastecimientos de combustible, registrando los kilómetros conducidos y
//los litros usados en cada tanque lleno. Desarrolle una aplicación en Java que reciba como entrada los kilómetros
//conducidos y los litros usados (ambos como enteros) por cada viaje. El programa debe calcular y mostrar los kilómetros
//por litro obtenidos en cada viaje, y debe imprimir el total de kilómetros por litro obtenidos en todos los
//viajes hasta este punto. Todos los cálculos del promedio deben producir resultados en números de punto flotante.
//Use la clase Scanner y la repetición controlada por centinela para obtener los datos del usuario

import java.util.Scanner;

public class conductores{
    public static void main(String[] args) {
        float km=0;
        float li=0;
        float k=0;
        boolean d=true;
        int j=1;
        int w=0;
        float u=0;
        float t=0;
        while(d){
            System.out.print("Ingrese el número de kilómetros que conduce en el" + " "+j+" "+"trayecto: ");
            Scanner m=new Scanner(System.in);
            km=m.nextFloat();
            System.out.print("Ingrese el número de litros de gasolina que gasta en el"+" "+j+" "+"trayecto: ");
            Scanner n=new Scanner(System.in);
            li=n.nextFloat();
            k=(km/li);
            t=(km/li)+u;
            System.out.print("El número de litros de gasolina por el trayecto"+" "+j+" "+"es:"+" "+k);
            System.out.println();
            System.out.print("El número de litros de gasolina total" + "es"+": "+t);
            System.out.println();
            System.out.print("¿Desea continuar con el trayecto? si=1, no=0");
            System.out.println();
            Scanner l=new Scanner(System.in);
            w=l.nextInt();

            if (w==1){
                j++;
                u=k;
                d=true;
            }
            else{
                d=false;
            }
            m.close();
            n.close();
            l.close();
        }
    }
}