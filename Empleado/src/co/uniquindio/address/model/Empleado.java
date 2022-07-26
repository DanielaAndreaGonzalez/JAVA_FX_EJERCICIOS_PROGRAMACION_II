package co.uniquindio.address.model;
/**
 * Clase para crear un empleado 
 * @author DanielaAGonzalezH
 *
 * 
 *
 */
public class Empleado {
	
	private String id;
	private String nombre;
	private String direccion;
	private String ciudad;
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
	 * @return el direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad el ciudad a establecer
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	} 
	
	public Empleado() {
		
	}
	/**
	 * Método que inicia todo el objeto existente con los valores recibidos
	 * @param id del Empleado 
	 * @param nombre del Empleado
	 * @param direccion del Empleado
	 * @param ciudad del Empleado
	 */
	public void fijarEmpleado(String id, String nombre,String direccion, String ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;	
	}
	
	public String toString() {
		return id +" " + nombre + " "+ direccion+ "" + " "+ciudad;
	}
	
	
	
	

}
