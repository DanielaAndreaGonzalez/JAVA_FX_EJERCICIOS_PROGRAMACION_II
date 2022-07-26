/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Vehiculo {
	
	private String placa;
	private int modelo;
	private Propietario propietario;
	private Tipo tipo;
	private Motor motor;
	
	/**
	 * @return el placa
	 */
	public String getPlaca() {
		return placa;
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	/**
	 * @param placa el placa a establecer
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return el modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Propietario getDuenio() {
		return this.propietario;
	}
	public Tipo getTipo() {
		return this.tipo;
	}
	public void setDuenio(Propietario duenio) {
		this.propietario = duenio;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Vehiculo(String placa, int modelo, Propietario duenio, Tipo tipo, Motor motor) {
		this.placa = placa;
		this.modelo = modelo;
		this.propietario = duenio;
		this.tipo = tipo;		
		this.motor =motor;
	}
	public Vehiculo() {
		
	}
	
	public boolean verificarFinalizarCaracter(char caracterEnviadoUsuario, char placaRegistrada) {
		
		boolean bandera= false;
		
		if(caracterEnviadoUsuario == placaRegistrada ) {
			bandera = true;
		}else {
			bandera = false;
		}
		return bandera;
	}

}
