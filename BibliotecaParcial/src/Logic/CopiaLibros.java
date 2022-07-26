/**
 * 
 */
package Logic;

/**Clase de Copia de Libros
 * @author DanielaAGonzalezH
 * @version 1.0
 * @Date 26/03/2022
 *
 */
public class CopiaLibros {
	
	private String id;
	private EstadoCopia lugar;
	private Libro libro;
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
	 * @return el lugar
	 */
	public EstadoCopia getLugar() {
		return lugar;
	}
	/**
	 * @param lugar el lugar a establecer
	 */
	public void setLugar(EstadoCopia lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return el libro
	 */
	public Libro getLibro() {
		return libro;
	}
	/**
	 * @param libro el libro a establecer
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public CopiaLibros(String id, EstadoCopia lugar, Libro libro) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.libro = libro;
	}
	
	
	
	

}
