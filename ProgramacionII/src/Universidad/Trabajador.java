/**
 * 
 */
package Universidad;

/**
 * @author DanielaAGonzalezH
 * @version 1.0 - @fecha 23/02/2022
 *
 * <h1>Clase trabajador</h1> Define los elementos de un trabajador
 */
public class Trabajador extends Persona{
	
	int numeroHoraExtraDiurna;
	int numeroHoraExtraNocturna;
	
	double VHED = 5200;
	double VHEN = 8300;

	/**
	 * M�todo Constructor
	 * @param cedula
	 * @param nombre
	 * @param salarioBasico
	 * @param numHoraExtDiurna
	 * @param numHoraExtNocturna
	 */
	public Trabajador(String cedula, String nombre, double salarioBasico,
			int numeroHoraExtraDiurna, int numeroHoraExtraNocturna) {
		super(cedula, nombre, salarioBasico);
		
		this.numeroHoraExtraDiurna = numeroHoraExtraDiurna;
		this.numeroHoraExtraNocturna = numeroHoraExtraNocturna;
	}
	/**
	 * @return el salario b�sico sum�ndole el valor de las horas
	 * extras diurnas y nocturnas
	 * se aplica polimorfismo, m�todo heredado de la clase padre
	 */
	
	public double sueldoBruto() {
		return this.salarioBasico + numeroHoraExtraDiurna * VHED +
				numeroHoraExtraNocturna * VHEN;
	}
	/**
	 * M�todo para modificar la cantidad de horas extras diurnas
	 * @return el n�mero de la hora extra diurna
	 */
	public int getNumeroHoraExtraDiurna() {
		return numeroHoraExtraDiurna;
	}
	/**
	 * M�todo que consulta la cantidad de las horas extras diurnas
	 * @param numeroHoraExtraDiurna
	 */
	public void setNumeroHoraExtraDiurna(int numeroHoraExtraDiurna) {
		this.numeroHoraExtraDiurna = numeroHoraExtraDiurna;
	}
	/**
	 * M�todo que consulta la cantidad de horas extras nocturnas
	 * @return el n�mero de la hora extra nocturna
	 */
	
	public int getNumeroHoraExtraNocturna() {
		return numeroHoraExtraNocturna;
	}
	/**
	 * M�todo que modifica la cantidad de horas extras nocturnas
	 * @param numeroHoraExtraNocturna
	 */
	public void setNumeroHoraExtraNocturna(int numeroHoraExtraNocturna) {
		this.numeroHoraExtraNocturna = numeroHoraExtraNocturna;
	}
	/**
	 * M�todo que consulta el valor de las horas extras diurnas
	 * @return el valor de la hora extra diurna
	 */
	public double getVHED() {
		return VHED;
	}
	/**
	 * Modifica el valor de la hora extra diurna
	 * @param vHED
	 */
	public void setVHED(double vHED) {
		VHED = vHED;
	}
	/**
	 * Consulta las horas extras nocturnas
	 * @return el valor de la hora extra nocturna
	 */
	public double getVHEN() {
		return VHEN;
	}
	/**
	 * Modifica las horas extras nocturnas
	 * @param vHEN
	 */
	public void setVHEN(double vHEN) {
		VHEN = vHEN;
	}
	

}
