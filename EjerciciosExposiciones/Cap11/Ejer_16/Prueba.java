/*11.16 (Atrapar excepciones con las superclases) Use la
herencia para crear una superclase de excepción llamada
ExcepcionA, así como las subclases de excepción ExcepcionB
y ExcepcionC, en donde ExcepcionB hereda de ExcepcionA
y ExcepcionC hereda de ExcepcionB. Escriba un programa para
demostrar que el bloque catch para el tipo ExcepcionA atrapa
excepciones de los tipos ExcepcionB y ExcepcionC. */
public class Prueba {

	public static void main(String[] args) {
		try {
			throw new ExcepcionB("Excepcion B");
		} catch (ExcepcionA e) {
			e.printStackTrace();
		}

		try {
			throw new ExcepcionC("Excepcion C");
		} catch (ExcepcionA e) {
			e.printStackTrace();
		}
	}
}