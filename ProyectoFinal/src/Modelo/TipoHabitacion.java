/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public enum TipoHabitacion {
	
	SUITE ((String) "1", (String) "Suite", (String) "Habitacion doble con baño de 12 m2"),
	JUNIOR_SUITE ((String) "2", (String) "Junior Suite", (String) "Habitacion doble con baño de 8m2"),
	GRAN_SUITE ((String) "3", (String) "Gran Suite", (String) "Dos o más  habitaciones doble con baño de 8m2"),
	INDIVIDUALES ((String) "4", (String) "Individuales", (String) "Habitacion sencilla con una cama de 6m2"),
	DOBLES ((String) "5", (String) "Dobles", (String) "Habitacion doble sencilla desde 11m2"),
	CUADRUPLES ((String) "6", (String) "Cuadruples", (String) "Habitacion desde 17 m2");
	
	
	protected String id;
	protected String nombre;
	protected String descripcion;
	/**
	 * @return el id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	private TipoHabitacion(String id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	
	
	

}
