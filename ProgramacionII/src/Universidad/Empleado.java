/**
 * 
 */
package Universidad;

/**
 * @author DanielaAGonzalezH
 * @version 1.0 - @fecha 23/02/2022
 * <h1> Clase Empleado </h1> Define los elementos de un empleado
 */
public class Empleado extends Persona{
	
	double bonificacion;
	/**
	 * M�todo constructor
	 * palabra clase super() para invocar el constructor de la
	 * clase padre 
	 * @param cedula
	 * @param nombre
	 * @param salarioBasico
	 * @param bonificacion
	 */
	public Empleado(String cedula, String nombre, 
			double salarioBasico, double bonificacion) {
		super(cedula, nombre, salarioBasico);
		
		this.bonificacion = bonificacion;	
	}
	/**Devuelve el salario b�sico m�s la bonificaci�n
	 * @return el salario b�sico + la bonificaci�n 
	 */
	public double sueldoBruto() {
		return this.salarioBasico + bonificacion;
	}
	

}
