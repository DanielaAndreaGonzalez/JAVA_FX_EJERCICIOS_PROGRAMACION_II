/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 * @date 24/04/2022
 */
public class Habitacion {
	
	private int id =0;
	public int numeroCamas;
	private int numeroBanios;
	public String descripcion;
	private String numeroHabitacion;
	private Hotel idHotel;
	private TipoHabitacion idTipoHabitacion;
	private boolean estado;
	private double valorHora;
	
	
	
	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return el numeroCamas
	 */
	public int getNumeroCamas() {
		return numeroCamas;
	}



	/**
	 * @param numeroCamas el numeroCamas a establecer
	 */
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}



	/**
	 * @return el numeroBanios
	 */
	public int getNumeroBanios() {
		return numeroBanios;
	}



	/**
	 * @param numeroBanios el numeroBanios a establecer
	 */
	public void setNumeroBanios(int numeroBanios) {
		this.numeroBanios = numeroBanios;
	}



	/**
	 * @return el descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}



	/**
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	/**
	 * @return el numeroHabitacion
	 */
	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}



	/**
	 * @param numeroHabitacion el numeroHabitacion a establecer
	 */
	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}



	/**
	 * @return el idHotel
	 */
	public Hotel getIdHotel() {
		return idHotel;
	}



	/**
	 * @param idHotel el idHotel a establecer
	 */
	public void setIdHotel(Hotel idHotel) {
		this.idHotel = idHotel;
	}



	/**
	 * @return el idTipoHabitacion
	 */
	public TipoHabitacion getIdTipoHabitacion() {
		return idTipoHabitacion;
	}



	/**
	 * @param idTipoHabitacion el idTipoHabitacion a establecer
	 */
	public void setIdTipoHabitacion(TipoHabitacion idTipoHabitacion) {
		this.idTipoHabitacion = idTipoHabitacion;
	}



	/**
	 * @return el estado
	 */
	public boolean isEstado() {
		return estado;
	}



	/**
	 * @param estado el estado a establecer
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return el valorHora
	 */
	public double getValorHora() {
		return valorHora;
	}
	
	
	/**
	 * @param valorHora el valorHora a establecer
	 */
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	/**
	 	* 	Método Constructor
	 	* @param id
	 	* @param numeroCamas
	 	* @param numeroBanios
	 	* @param descripcion
	 	* @param numeroHabitacion
	 	* @param idHotel
	 	* @param idTipoHabitacion
	 	* @param estado
	 	* @param idReserva
	 	* @param valorHora
 */

	public Habitacion(int numeroCamas, String descripcion) {
		this.numeroCamas = numeroCamas;
		this.descripcion = descripcion;
	}
	
	public Habitacion(int numeroCamas, int numeroBanios, String descripcion, String numeroHabitacion,
			Hotel idHotel, TipoHabitacion idTipoHabitacion, boolean estado, double valorHora) {
		super();
		
		this.id = id++;
		this.numeroCamas = numeroCamas;
		this.numeroBanios = numeroBanios;
		this.descripcion = descripcion;
		this.numeroHabitacion = numeroHabitacion;
		this.idHotel = idHotel;
		this.idTipoHabitacion = idTipoHabitacion;
		this.estado = estado;
		this.valorHora = valorHora;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
