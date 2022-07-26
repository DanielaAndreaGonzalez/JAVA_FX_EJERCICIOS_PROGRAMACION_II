/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Puesto {
	
	private Tipo tipo;
	private Posicion posicion;
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public Tipo getTipo() {
		return this.tipo;
	}
	public Posicion getPosicion() {
		return this.posicion;
	}
	
	public Puesto(Tipo tipo,int i, int j) {
		this.posicion = new Posicion(i, j);
		this.tipo = tipo;
	}

}
