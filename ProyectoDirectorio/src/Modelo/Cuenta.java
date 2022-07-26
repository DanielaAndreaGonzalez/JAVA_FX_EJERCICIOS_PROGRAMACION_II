/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Cuenta {
	
	private String nombre;
	private String email;
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
	 * @return el email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email el email a establecer
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public Cuenta(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	
	

}
