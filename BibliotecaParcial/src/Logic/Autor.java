/**
 * 
 */
package Logic;

import java.time.LocalDate;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Autor extends Persona{
	
	private String nacionalidad;
	private LocalDate fechaNacimiento;
	
	/**
	 * @return el nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad el nacionalidad a establecer
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return el fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento el fechaNacimiento a establecer
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Autor(String nombre,String nacionalidad, LocalDate fechaNacimiento) {
		super(nombre);
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
	
	}
	
	
	

}
