/**
 * 
 */
package Controlador;
import Modelo.Posicion.*;
import Modelo.Tipo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

import Modelo.*;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Parqueadero {

	private Puesto miPuesto0;
	private Puesto miPuesto1;
	private Puesto miPuesto2;
	private Puesto miPuesto3;
	
	private Registro miRegistro0;
	private Registro miRegistro1;
	private Registro miRegistro2;
	private Registro miRegistro3;
	
	private Vehiculo vehiculo0;
	private Vehiculo vehiculo1;
	private Vehiculo vehiculo2;
	private Vehiculo vehiculo3;
	
	
	
	private ArrayList <Vehiculo> vehiculos = new ArrayList<>();
	private ArrayList <Registro> registros = new ArrayList<>();
	
	public Parqueadero() {
	}
	
	public void inicializarParqueadero() {
		Tipo carro = Tipo.CARRO;
		miPuesto0 =new Puesto(carro, 0, 1);
		Propietario propietario = new Propietario("Daniela Andrea", "29329138");
		Motor motor0 = Motor.COMBUSTION_EXTERNA;
		vehiculo0 = new Vehiculo("ABC123", 2020, propietario, carro, motor0);
		miRegistro0 = new Registro(miPuesto0, vehiculo0);
		
		Tipo moto = Tipo.MOTO;
		miPuesto1=new Puesto(moto, 0, 1);
		Propietario propietario1 = new Propietario("Daniela Andrea", "99298102");
		Motor motor1= Motor.COMBUSTION_INTERNA;
		vehiculo1 = new Vehiculo("ZIQ769", 2019, propietario1, moto,motor1);
		miRegistro1 = new Registro(miPuesto1, vehiculo1);
	
		Tipo moto2 = Tipo.MOTO;
		miPuesto2=new Puesto(moto, 0, 1);
		Propietario propietario2 = new Propietario("Daniela Andrea", "9900100");
		Motor motor2 = Motor.MOTOR_ELECTRICO;
		vehiculo2 = new Vehiculo("CBA323", 2021, propietario2, moto2,motor2);
		miRegistro2 = new Registro(miPuesto2, vehiculo2);
		
		Tipo carro2 = Tipo.CARRO;
		miPuesto3=new Puesto(moto, 0, 1);
		Propietario propietario3 = new Propietario("Daniela Andrea", "100365");
		Motor motor3 = Motor.COMBUSTION_EXTERNA;
		vehiculo3 = new Vehiculo("CAT216", 2018, propietario3, carro2,motor3);
		miRegistro3 = new Registro(miPuesto3, vehiculo3);
		
		vehiculos.add(vehiculo0);
		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		
		registros.add(miRegistro0);
		registros.add(miRegistro1);
		registros.add(miRegistro2);
		registros.add(miRegistro3);
	}
	public Registro obtenerRegistroPorNumero(int entero) {
		Registro miR=null;
		if (entero ==0) {miR = miRegistro0; }
		if (entero ==1) {miR = miRegistro1; }
		if (entero ==2) {miR = miRegistro2; }
		if (entero ==3) {miR = miRegistro3; }
		
		return miR;
	}
	
	public Registro obtenerRegistroVacioPorTipo(Tipo tipo) {
		Registro regis=null;
		return regis;
	}
	public Posicion ubicarVehiculo(Tipo tipo,Vehiculo vehiculo) {
		Posicion posi=null;
		return posi;
	}
	public Propietario informarPropietarioVehiculoPuesto(int entero) {
		Propietario duenio=null;
		return duenio;
	}
	
	/*
	 * PUNTO 3
	 */
	public double hallarPotenciaPromedio() {
		int acumulado=0;
		double promedio=0;
		int tamanio=vehiculos.size();
		
		for(Vehiculo vehiculo: vehiculos) {
			acumulado += vehiculo.getMotor().getPotencia();
		}
		promedio = (acumulado/tamanio);
	
		return promedio;
	}
	public boolean verificarPlacasConID(String id) {
		boolean bandera = false;	
		for(Vehiculo vehiculos: vehiculos) {
			
			if(vehiculos.getDuenio().getId().equals(id)) {
				bandera=true;
			}	
		}
		return bandera;
	}
	
	public String devolverPlacasConId(String id) {
		String cadena ="";
		for(Vehiculo vehiculos: vehiculos) {
			if(vehiculos.getDuenio().getId().equals(id)) {
				cadena += "Placa: "+vehiculos.getPlaca();
			}	
		}
		return cadena;
	}
	public boolean determinarPotenciaExcede(double promedioPotencia) {
		boolean bandera=false;
		for(Vehiculo vehiculo: vehiculos) {
			if(vehiculo.getMotor().getPotencia()> promedioPotencia) {
				bandera = true;
			}
		}
		return bandera;
	}
	public void imprimirInformacion() {
		String cadena ="";
		String id = leerCadena("Ingrese el Id del propietario");
		if (verificarPlacasConID(id)) {
			cadena += devolverPlacasConId(id);
		}
		System.out.println("Promedio potencia: "+hallarPotenciaPromedio());
		System.out.println(cadena);
	}
	/*
	 * PUNTO 1
	 */
	public Posicion devolverPosicionPuestoMasOcupacion() {
		Posicion posicion=null;
		if (obtenerPuestoMayorVisitas().equals(miRegistro0)) {
			posicion = miPuesto0.getPosicion();
		}
		if (obtenerPuestoMayorVisitas().equals(miRegistro1)) {
			posicion = miPuesto1.getPosicion();
		}
		if (obtenerPuestoMayorVisitas().equals(miRegistro2)) {
			posicion = miPuesto2.getPosicion();
		}
		if (obtenerPuestoMayorVisitas().equals(miRegistro3)) {
			posicion = miPuesto3.getPosicion();
		}
		return posicion;
	}
	
	public String devolverRegistrosVehiculoCantidad(char caracter, int a) {
		return "";
	}
	public Registro obtenerPuestoMayorVisitas() {
		int mayor=0;
		Registro registroMayor=null;
		
		int registro1 =this.miRegistro0.getCantidadVisitas();
		int registro2 =this.miRegistro1.getCantidadVisitas();
		int registro3 =this.miRegistro2.getCantidadVisitas();
		int registro4 =this.miRegistro3.getCantidadVisitas();
		
		
		if(registro1 > mayor) {
			mayor=registro1;
		}
		if(registro2 > mayor){
			mayor= registro2;
		}
		if(registro3 > mayor) {
			mayor = registro3;
		}
		if(registro4 > mayor) {
			mayor = registro4;
		}
		
		if (registro1 == mayor) {
			registroMayor = obtenerRegistroPorNumero(0);
		}
		else if(registro2 ==mayor) {
			registroMayor = obtenerRegistroPorNumero(1);
		}
		else if (registro3 ==mayor) {
			registroMayor = obtenerRegistroPorNumero(2);
		}
		else if (registro4 ==mayor) {
			registroMayor = obtenerRegistroPorNumero(3);
		}
		return registroMayor;
	}
	
	public int leerInt(String mensaje) {
		Scanner dato= new Scanner(System.in);
		System.out.println(mensaje);
		int numero = dato.nextInt();
		return numero;
	}
	
	public String leerCadena(String mensaje) {
		Scanner dato= new Scanner(System.in);
		System.out.println(mensaje);
		String cadena = dato.nextLine();
		return cadena;
	}
	
	public char leerCaracter(String mensaje) {
		Scanner dato = new Scanner(System.in);
		System.out.println(mensaje);
		char caracter = dato.next().charAt(0);
		
		return caracter;
	}
	
	public boolean verificarRegistros(int rango_inferior,int rango_superior) {
		boolean bandera=false; 
		for(Registro registros: registros) {
			 if(registros.getCantidadVisitas()>= rango_inferior && registros.getCantidadVisitas()<= rango_superior)
				 bandera = true;
		 }	 
		return bandera;
	}
	
	public String verificarRegistrosInformacion() {
		char placaIngresadaUsuario = leerCaracter("Ingrese el último cáracter de la placa que desea ver el registro ");
	    int rango_inferior = leerInt("Desde dónde quiere ver el rango : ");
	    int rango_superior = leerInt("Hasta dónde queire ver el rango");
	   // Vehiculo vehiculo = new Vehiculo();
	    char caracterPlacaRegistrada =' '; 
	    String cadena =""; 
	    int contador=0;
	    
	    for(Vehiculo placas: vehiculos) {
	    	for(int i=0; i<placas.getPlaca().length();i++) {
	    		caracterPlacaRegistrada = placas.getPlaca().charAt(placas.getPlaca().length()-1);
	    	} 
	    	if (placas.verificarFinalizarCaracter(placaIngresadaUsuario, caracterPlacaRegistrada)) {
	    		contador++;
	    		cadena+="\nRegistro "+contador+" Cantidad visitas ";
	    		cadena+=", vehículo de placa: "+placas.getPlaca();
	    	}
	    	
	    }   
	   
	  return cadena;
	}
	
	public void consultarCantidadVisitas(int rango1, int rango2) {
			String cadena="";
			for(Registro registro: registros) {
				if(registro.getCantidadVisitas() >= rango1 && registro.getCantidadVisitas() <=rango2 ) {
					
				}
				
			}
	}

	
	
	
	
	
	
}
