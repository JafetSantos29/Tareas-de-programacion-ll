/*(Falla del constructor) Escriba un programa que muestre cómo un constructor pasa información sobre la
falla del constructor a un manejador de excepciones. Defina la clase UnaClase, que lance una excepción Exception en
el constructor. Su programa deberá tratar de crear un objeto de tipo UnaClase y atrapar la excepción que se lance
desde el constructor. */
package Ejer_19;

public class UnaClasePrueba {
    public static void main(String[] args) {
        try {
            new UnaClase(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
