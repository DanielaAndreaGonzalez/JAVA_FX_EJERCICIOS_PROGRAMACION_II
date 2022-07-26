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
	 * M�todo constructor
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
	 * M�todo de la clase Padre 
	 * @return el salario b�sico + la participaci�n
	 */
	@Override
	public double sueldoBruto() {
		return this.salarioBasico + participacion;
	}
	/**
	 * M�todos get y set
	 */
	public double getParticipacion() {
		return participacion;
	}
	public void setParticipacion(double participacion) {
		this.participacion = participacion;
	}
	
	

}
