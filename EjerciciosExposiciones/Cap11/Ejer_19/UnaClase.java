package Ejer_19;

public class UnaClase {
    private int numero;

    public UnaClase(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("El número debe ser mayor o igual a cero");
        }
    }
}
