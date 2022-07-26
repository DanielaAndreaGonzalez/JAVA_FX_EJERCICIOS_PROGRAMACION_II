/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public enum TipoUsuario {
	
	ADMINISTRADOR ((String) "1", (String) "Administrador", (String) "El administrador de la página"),
	CLIENTE((String) "2", (String) "Cliente" , (String) "El usuario que usa de la aplicación");
	
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
	
	protected String id;
	protected String nombre;
	protected String descripcion;
	private TipoUsuario(String id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	
	
	

}
