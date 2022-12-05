//(Otro problema de else suelto) Modifique el código dado para producir la salida que se muestra en cada
//parte del problema. Utilice las técnicas de sangría apropiadas. No haga modificaciones en el código, sólo inserte llaves
//o modifique la sangría del código. El compilador ignora la sangría en un programa en Java. Hemos eliminado la sangría
//en el código dado, para hacer el problema más retador. [Nota: es posible que no se requieran modificaciones en algunas
//de las partes].

//Suponiendo que x = 5 y y = 8, se produce la siguiente salida:
//@@@@@
//$$$$$
//&&&&&

public class elsesuelto1{
    public static void main(String[] args) {
        int x=5;
        int y=8;
        
        if (y==8){
            if (x==5){
                System.out.println("@@@@@");
            }
        }
        else{
            System.out.println("#####");
        }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
    }
}