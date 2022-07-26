/**
 * 
 */
package Universidad;

/**
 * @author DanielaAGonzalezH
 * @versi�n 1.0 - @fecha 23/02/2022
 * <h1>Clase Persona </h1> Define los elementos de una persona
 */
public class Persona {
	//Atributos
	String cedula;
	String nombre;
	double salarioBasico=0;
	
	/**
	 * M�todo constructor 
	 * @param cedula
	 * @param nombre
	 * @param salarioRecibido
	 * 
	 */
	public Persona(String cedula,String nombre, double salarioRecibido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.salarioBasico = salarioRecibido;
	}
	
	public double sueldoBruto() {
		return this.salarioBasico;
	}
	
	
	
	

}
