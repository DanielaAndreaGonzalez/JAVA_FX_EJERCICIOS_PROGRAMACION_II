/**
 * 
 */
package Universidad;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Gerente extends Persona{
	
	public double participacion; 
	/**
	 * Método constructor
	 * @param cedula
	 * @param nombre
	 * @param salarioBasico
	 * @param participacion
	 */
	public Gerente(String cedula,String nombre,
			double salarioBasico,double participacion) {
		super(cedula,nombre,salarioBasico);
		this.participacion = participacion;
		
	}
	/**
	 * Método de la clase Padre 
	 * @return el salario básico + la participación
	 */
	@Override
	public double sueldoBruto() {
		return this.salarioBasico + participacion;
	}
	/**
	 * Métodos get y set
	 */
	public double getParticipacion() {
		return participacion;
	}
	public void setParticipacion(double participacion) {
		this.participacion = participacion;
	}
	
	

}
