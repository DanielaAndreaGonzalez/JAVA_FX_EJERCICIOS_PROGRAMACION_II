/**
 * 
 */
package Logic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author DanielaAGonzalezH
 *
 */
public class Lector extends Persona{
	
	private String id;
	private String telefono;
	private String direccion;
	private Prestamo prestamo[];  
	private Multa multa;
	
	/**
	 * @return el id
	 */
	public String getId() {
		return id;
	}
	public Prestamo[] getPrestamo() {
		return this.prestamo;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	public Multa GetMulta() {
		return this.multa;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setMulta(Multa multa) {
		this.multa = multa;
	}
	
	public Lector(String nombre, String id, String telefono, String direccion,Multa multa) {
		super(nombre);
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.multa = multa;
		this.prestamo = new Prestamo[3];
	}
	
	public int leerEntero(String mensaje) {
		System.out.println(mensaje);
		Scanner dato = new Scanner(System.in);
		int numero = dato.nextInt();
		return numero;
	}
	public String leerString(String mensaje) {
		System.out.println(mensaje);
		Scanner dato = new Scanner(System.in);
		String cadena = dato.nextLine();
		return cadena;
	}
	public boolean leerBooleano(String mensaje) {
		
		boolean bandera = false;
		String respuesta = leerString(mensaje);
		if(respuesta.equals("s")) {
			bandera = true;
		}else {
			bandera = false;
		}	
		return bandera;
	}
	public LocalDate Fecha(int anio, String mes, int dia) {
		
		Month mes1=null;
		
		if(mes.equals("Enero")) {mes1 = Month.JANUARY;}
		if(mes.equals("Febrero")) {mes1 = Month.FEBRUARY;}
		if(mes.equals("Marzo")) {mes1 = Month.MARCH;}
		if(mes.equals("Abril")) {mes1 = Month.APRIL;}
		if(mes.equals("Mayo")) {mes1 = Month.JUNE;}
		if(mes.equals("Junio")) {mes1 = Month.MAY;}
		if(mes.equals("Julio")) {mes1 = Month.JULY;}
		if(mes.equals("Agosto")) {mes1 = Month.AUGUST;}
		if(mes.equals("Septiembre")) {mes1 = Month.SEPTEMBER;}
		if(mes.equals("Octubre")) {mes1 = Month.OCTOBER;};
		if(mes.equals("Noviembre")) {mes1 = Month.NOVEMBER;}
		if(mes.equals("Diciembre")) {mes1 = Month.DECEMBER;}
		
		LocalDate fecha = LocalDate.of(anio, mes1, dia);
		return fecha;
	}
	public void Prestar(LocalDate fechaInicio, LocalDate fechaFin,CopiaLibros copia,Lector lector) {
			for(int i=0; i<prestamo.length;i++) {
				if(prestamo[i] ==null) {
						prestamo[i] = new Prestamo(fechaInicio,fechaFin,copia,lector);
						copia.setLugar(EstadoCopia.PRESTADO);
						break;
				}
		  }
	}
	
	public void quitarPrestamo() {
		for(int i=0; i <prestamo.length;i++) {
			if(prestamo[i] != null) {
				prestamo[i] = null;
	          }	
	       }
	}
	
	
	public boolean validarPrestamo() {
		boolean bandera = false;
			if(this.multa.getFechaInicio() == null && this.multa.getFechaFin() == null) {
				for(int i=0; i <prestamo.length;i++) {
					if(prestamo[i] == null) {
						bandera = true; 
			          }	
			       }
		}
		return bandera;
	}
	public void devolver(LocalDate fechaFin) {
		int diasTotalMulta =0;
		//LocalDate fechaFin = multa.getFechaFin();
		//IsAfter método para comparar dos fechas de localDate
		if(LocalDate.now().isAfter(fechaFin) ) {
			//Variable de tipo long, almacena mediante el método until
			//el calculo de la cantidad de tiempo hasta otro temporal en términos de la unidad especificada
			long dias = LocalDate.now().until(fechaFin,ChronoUnit.DAYS);
			diasTotalMulta = (int) dias * 2;
			multa.setFechaInicio(LocalDate.now());
			multa.setFechaFin(fechaFin.plusDays(diasTotalMulta));
			LocalDate fin = fechaFin.plusDays(diasTotalMulta);
			System.out.println("Quedó con multa, hasta la fecha"+fin);
			quitarPrestamo();
		}else {
			System.out.println("Quedó a paz y salvo con la biblioteca");
			quitarPrestamo();	
		}	
	}
	
	public int prestarLibros(String mensaje) {
		int opcion = leerEntero(mensaje + "\nPresione 1. Cien años de Soledad "
										+ "\nPresione 2. Rayuela"
										+ "\nPresione 3. La tía Julia y el Escribidor");
		return opcion;
	}

	 
	
	

}
