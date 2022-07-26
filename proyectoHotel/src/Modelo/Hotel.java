package Modelo;
/**
 * 
 * @author DanielaAGonzalezH
 *
 */
public class Hotel {
	
	protected String is;
	protected String nombre;
	protected String descripcion;
	protected String direccion;
	protected String telefono;
	

	
	/**
	 * @return el is
	 */
	public String getIs() {
		return is;
	}

	/**
	 * @param is el is a establecer
	 */
	public void setIs(String is) {
		this.is = is;
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
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Hotel(String is, String nombre, String descripcion, String direccion, String telefono) {
		super();
		this.is = is;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	

}
