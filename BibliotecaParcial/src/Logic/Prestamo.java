/**
 * 
 */
package Logic;

import java.time.LocalDate;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Prestamo {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private CopiaLibros copia;
	private Lector lector;
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
	public Prestamo(LocalDate fechaInicio, LocalDate fechaFin, CopiaLibros copia,Lector lector) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.copia = copia;
		this.lector = lector;
	}
	
	
	

}
