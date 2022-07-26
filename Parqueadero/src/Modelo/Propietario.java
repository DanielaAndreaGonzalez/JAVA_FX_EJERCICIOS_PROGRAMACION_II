/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Propietario {
	
	private String nombre;
	private String id;
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

	public Propietario(String nombre, String id) {
		//super();
		this.nombre = nombre;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}
