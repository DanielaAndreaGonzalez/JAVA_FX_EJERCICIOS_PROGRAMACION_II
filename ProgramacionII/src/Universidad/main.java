/**
 * 
 */
package Universidad;

/**
 * @author DanielaAGonzalezH
 * @version 1.0 - @fecha 23/02/2022
 * <h1>Clase main </h1> Realiza la ejecución del programa
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Persona daniela = new Persona("1234233","Daniela",1000015);
		System.out.println("El salario de "+daniela.nombre+
				" identificado con cédula : "+daniela.cedula+
				" es " + daniela.salarioBasico);
		
		Trabajador augusto = new Trabajador("34321665", "Augusto", 950000,2 , 4);
		System.out.println("El salario de: "+augusto.nombre +
				" identificado con cédula: "+augusto.cedula +
				" es: "+augusto.sueldoBruto());
		Gerente steve = new Gerente("134566", "Steve",5000000,100000);
		System.out.println("El salario de "+steve.nombre+
							" identificado con cédula: "+steve.cedula+
							" es: "+steve.salarioBasico +
							" Y su participación : "+steve.participacion);

	}

}
