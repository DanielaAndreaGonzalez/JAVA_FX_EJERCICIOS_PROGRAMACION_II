/**
 * 
 */
package Logic;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Multa {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	/**
	 * @return el fechaInicio
	 */
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio el fechaInicio a establecer
	 */
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return el fechaFin
	 */
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin el fechaFin a establecer
	 */
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Multa(LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public Multa() {
		
	}
	
	

}
