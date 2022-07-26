/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String direccion;
	protected int edad;
	protected String correo;
	protected String contrasena;
	protected TipoUsuario tipoUsuario;
	
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
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return el correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo el correo a establecer
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return el contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena el contrasena a establecer
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return el tipoUsuario
	 */
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario el tipoUsuario a establecer
	 */
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public Persona(String nombre, String apellido, String telefono, String direccion, int edad, String correo,
			String contrasena, TipoUsuario tipoUsuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.edad = edad;
		this.correo = correo;
		this.contrasena = contrasena;
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	

}
