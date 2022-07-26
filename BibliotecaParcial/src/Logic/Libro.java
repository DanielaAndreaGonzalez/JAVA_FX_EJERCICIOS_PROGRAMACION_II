/**
 * 
 */
package Logic;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Libro {
	
	private String nombre;
	private Tipo tipoLibro;
	private String editorial;
	private Autor autor;
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
	 * @return el tipoLibro
	 */
	public Tipo getTipoLibro() {
		return tipoLibro;
	}
	/**
	 * @param tipoLibro el tipoLibro a establecer
	 */
	public void setTipoLibro(Tipo tipoLibro) {
		this.tipoLibro = tipoLibro;
	}
	/**
	 * @return el editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial el editorial a establecer
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	/**
	 * @return el autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Libro(String nombre, Tipo tipoLibro, String editorial, Autor autor) {
		super();
		this.nombre = nombre;
		this.tipoLibro = tipoLibro;
		this.editorial = editorial;
		this.autor = autor;
	}
	
	
	

	
	
	
	
	
	
	
	
}
