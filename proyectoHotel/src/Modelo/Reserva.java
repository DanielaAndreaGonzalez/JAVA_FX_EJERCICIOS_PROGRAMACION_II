/**
 * 
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Reserva {
	
	private String idReserva;
	private LocalDate fechaInicio;
	private LocalDateTime horaInicio;
	private LocalDate fechaFin;
	private LocalDateTime horaFin;
	private Usuario usuario;
	private Habitacion habitacion;

	
	/**
	 * @return el idReserva
	 */
	public String getIdReserva() {
		return idReserva;
	}


	/**
	 * @param idReserva el idReserva a establecer
	 */
	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}


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
	 * @return el horaInicio
	 */
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}


	/**
	 * @param horaInicio el horaInicio a establecer
	 */
	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
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


	/**
	 * @return el horaFin
	 */
	public LocalDateTime getHoraFin() {
		return horaFin;
	}


	/**
	 * @param horaFin el horaFin a establecer
	 */
	public void setHoraFin(LocalDateTime horaFin) {
		this.horaFin = horaFin;
	}


	/**
	 * @return el usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario el usuario a establecer
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	/**
	 * @return el habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}


	/**
	 * @param habitacion el habitacion a establecer
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}


	public Reserva(String idReserva, LocalDate fechaInicio, LocalDateTime horaInicio, LocalDate fechaFin,
			LocalDateTime horaFin, Usuario usuario, Habitacion habitacion) {
		super();
		this.idReserva = idReserva;
		this.fechaInicio = fechaInicio;
		this.horaInicio = horaInicio;
		this.fechaFin = fechaFin;
		this.horaFin = horaFin;
		this.usuario = usuario;
		this.habitacion = habitacion;
	}


	
	
	
	

}
