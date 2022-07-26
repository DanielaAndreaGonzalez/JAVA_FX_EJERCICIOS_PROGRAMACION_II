/**
 * 
 */
package Controlador;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Controller {
	
	public Controller() {
		
	}
	
	/**
	 * Menú
	 */
	Parqueadero parqueadero = new Parqueadero();
	public int imprimirMenu() {
		String cadena = "1. Devolver posición puesto más ocupación: "+
						  "\n 2. Devolver información registro cantidad visitas "+
						  "\n 3. Devolver placas a partir del Id propietario";
		int opcion = parqueadero.leerInt(cadena);
		return opcion;
	}
	
	public void inicializarMenu() {
		parqueadero.inicializarParqueadero();
		boolean bandera=true;
		while(bandera) {
			int opcion= imprimirMenu();
			switch(opcion) {
			case 1:
				
				System.out.println(parqueadero.devolverPosicionPuestoMasOcupacion());
				bandera=false;
				break;
			case 2:
				System.out.println(parqueadero.verificarRegistrosInformacion());
				bandera=false;
				break;
			case 3:
				parqueadero.imprimirInformacion();
				bandera=false;
				break;
			case 4:
				bandera =false;
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			
			}
			
			
		}
	}
	
	
	

}
