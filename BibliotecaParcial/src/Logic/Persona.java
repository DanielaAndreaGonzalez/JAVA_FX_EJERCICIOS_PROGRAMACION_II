/**
 * 
 */
package Logic;

/**
 * @author DanielaAGonzalezH
 *
 */
public abstract class Persona {
	
	private String nombre;

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

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
	
	

}
