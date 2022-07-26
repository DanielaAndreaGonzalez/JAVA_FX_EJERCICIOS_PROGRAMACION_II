/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public enum Tipo {

	CARRO(1),
	MOTO(2);
	private int numTipo;
	
	public int getNumTipo() {
		return this.numTipo;
	}
	public void setNumTipo(int numTipo) {
		this.numTipo = numTipo;
	}
	private Tipo(int num) {
		
	}
	
	
}
