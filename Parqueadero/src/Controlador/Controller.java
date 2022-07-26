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
	 * Men�
	 */
	Parqueadero parqueadero = new Parqueadero();
	public int imprimirMenu() {
		String cadena = "1. Devolver posici�n puesto m�s ocupaci�n: "+
						  "\n 2. Devolver informaci�n registro cantidad visitas "+
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
				System.out.println("Opci�n incorrecta");
				break;
			
			}
			
			
		}
	}
	
	
	

}
