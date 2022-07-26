/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Posicion {
	private int i;
	private int j;
	
	
	public int getI() {
		return this.i;
	}
	public int getJ() {
		return this.j;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public Posicion(int i, int j) {
		this.i = i;
		this.j= j;
	}
	@Override
	public String toString() {
		return "Posicion [i=" + i + ", j=" + j + "]";
	}
	
	
	
	
	
	
}
