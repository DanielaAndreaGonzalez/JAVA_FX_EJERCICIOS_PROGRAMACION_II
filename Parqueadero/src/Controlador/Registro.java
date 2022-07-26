/**
 * 
 */
package Controlador;

import Modelo.Puesto;
import Modelo.Vehiculo;

/**
 * @author DanielaAGonzalezH
 *@version 1.0
 *
 */
public class Registro {
	private int cantidadVisitas;
	private Puesto puesto;
	private Vehiculo vehiculo;
	
	//private static int contadorVisitas;	
	/**
	 * @return el cantidadVisitas
	 */
	public int getCantidadVisitas() {
		return cantidadVisitas;
	}
	/**
	 * @param cantidadVisitas el cantidadVisitas a establecer
	 */
	public void setCantidadVisitas(int cantidadVisitas) {
		this.cantidadVisitas = cantidadVisitas;
	}
	/**
	 * @return el puesto
	 */
	public Puesto getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto el puesto a establecer
	 */
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return el vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	/**
	 * @param vehiculo el vehiculo a establecer
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Registro(Puesto puesto, Vehiculo vehiculo) {
		this.puesto = puesto;
		this.vehiculo = vehiculo;
		cantidadVisitas++;
		//Registro.contadorVisitas++;
	    //cantidadVisitas = Registro.contadorVisitas;
	}
	public Registro() {
		
	}
	public void actualizarVehiculoActual(Vehiculo vehiculo) {
		//tener en cuenta la lógica de este método es un set
		this.vehiculo = vehiculo;
	}
	public void eliminarVehiculoActual() {
		
	}
	public boolean verificarSiHayVehiculo() {
		return true;
	}
	
	
	
	
	
	

}
