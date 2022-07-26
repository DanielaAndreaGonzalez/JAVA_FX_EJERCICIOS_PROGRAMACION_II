/**
 * 
 */
package Modelo;

/**
 * @author DanielaAGonzalezH
 *
 */
public enum Motor {
	
	COMBUSTION_INTERNA( (double)1.5,(double)2.0,(double)3.5),
	COMBUSTION_EXTERNA((double)1.5,(double)1.5,(double)2.0),
	MOTOR_ELECTRICO((double)1.0,(double)1.2,(double)1.3);
	
	private double rendimiento;
	private double velocidadNominal;
	private double potencia;
	
	/**
	 * @return el rendimiento
	 */
	public double getRendimiento() {
		return rendimiento;
	}

	/**
	 * @param rendimiento el rendimiento a establecer
	 */
	public void setRendimiento(double rendimiento) {
		this.rendimiento = rendimiento;
	}

	/**
	 * @return el velocidadNominal
	 */
	public double getVelocidadNominal() {
		return velocidadNominal;
	}

	/**
	 * @param velocidadNominal el velocidadNominal a establecer
	 */
	public void setVelocidadNominal(double velocidadNominal) {
		this.velocidadNominal = velocidadNominal;
	}

	/**
	 * @return el potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia el potencia a establecer
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	private Motor(double rendimiento, double velocidad, double potencia) {
		this.rendimiento = rendimiento;
		this.velocidadNominal = velocidad;
		this.potencia = potencia;
	}
	
	private Motor() {
		
	}

}
