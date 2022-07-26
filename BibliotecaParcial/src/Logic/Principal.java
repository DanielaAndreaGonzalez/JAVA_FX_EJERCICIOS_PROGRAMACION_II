/**
 * 
 */
package Logic;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;




/**Clase que contiene los datos "quemados" de autores, copias, lectores y libros
 * 
 * @author DanielaAGonzalezH
 * @version 1.0
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		LocalDate fechaInicio = null;
		LocalDate fechaFin = null;
		ArrayList <Lector> lectores = new ArrayList<>();
		ArrayList <CopiaLibros> copias1 = new ArrayList<>();
		ArrayList <CopiaLibros> copias2 = new ArrayList<>();
		ArrayList <CopiaLibros> copias3 = new ArrayList<>();
		
		String id = "";
		
		//Creación Autores
		Autor autor1 = new Autor("Gabriel García Marquéz", "Colombiana",LocalDate.of(1927, Month.MARCH, 06) );
		Autor autor2 = new Autor("Julio Cortázar", "Belga",LocalDate.of(1914, Month.AUGUST, 26) );
		Autor autor3 = new Autor("Mario Vargas Llosa", "Peruano",LocalDate.of(1936, Month.MARCH, 23) );
		
		//Creación Libros
		Libro libro1 = new Libro("Cien años de Soledad", Tipo.NOVELA,"Sudamericana", autor1);
		Libro libro2 = new Libro("Rayuela", Tipo.NOVELA,"Sudamericana", autor2);
		Libro libro3 = new Libro("La tía Julia y el Escribidor", Tipo.NOVELA,"Seix Barral", autor3);
		
		//Creación Copias
		CopiaLibros copia1 = new CopiaLibros("858.1", EstadoCopia.BIBLIOTECA, libro1);
		CopiaLibros copia1_1 = new CopiaLibros("858.2", EstadoCopia.BIBLIOTECA, libro1);
		CopiaLibros copia1_2 = new CopiaLibros("852.3", EstadoCopia.PRESTADO, libro1);
		
		copias1.add(copia1);
		copias1.add(copia1_1);
		copias1.add(copia1_2);
		
		CopiaLibros copia2 = new CopiaLibros("863.1", EstadoCopia.BIBLIOTECA, libro2);
		CopiaLibros copia2_1 = new CopiaLibros("863.2", EstadoCopia.REPARACION, libro2);
		CopiaLibros copia2_2 = new CopiaLibros("863.3", EstadoCopia.RETRASO, libro2);
		
		copias2.add(copia2);
		copias2.add(copia2_1);
		copias2.add(copia2_2);
		
		CopiaLibros copia3 = new CopiaLibros("868.1", EstadoCopia.BIBLIOTECA, libro3);
		CopiaLibros copia3_1 = new CopiaLibros("868.2", EstadoCopia.PRESTADO, libro3);
		CopiaLibros copia3_2 = new CopiaLibros("868.3", EstadoCopia.PRESTADO, libro3);
		
		copias3.add(copia3);
		copias3.add(copia3_1);
		copias3.add(copia3_2);
		
		
		//Lector
		
		Multa multa1 = new Multa(null,null);
		Multa multa2 = new Multa(LocalDate.of(2022, Month.MARCH, 21), LocalDate.of(2022, Month.MARCH, 23));
		
		Lector lector1 = new Lector("Juan Peréz ", "U234", "(321)543-1234", "Calle 12 N° 4-22",multa1);
		Lector lector2 = new Lector("Pedro Jaramillo ", "U098", "(300)876-2320", "Carrera 2 N° 7-21",multa1);
		Lector lector3 = new Lector("Claudia Barco ", "U761", "(315)876-1100", "Carrera 2 N° 7-21",multa2);
		
		
		lectores.add(lector1);
		lectores.add(lector2);
		lectores.add(lector3);
		
		
		boolean bandera = true;
		while(bandera) {
			int opcion = lector1.leerEntero("Presione 1. para hacer prestamos \nPresione 2.Para devolver libros\nPresione 0. para salir");
			
			switch (opcion) {
			case 1:
				id = lector1.leerString("Ingrese el Id del Lector");
				String cadena = "";
				if (id != null) {
					if (!verificarLector(lectores, id)) {
						System.out.println("El lector no está ingresado");
					} else {
						for (Lector lector : lectores) {
							if (lector.getId().equals(id)) {
								if (lector.validarPrestamo()) {
									System.out.println("Ingrese la fecha de inicio de préstamo: ");
									int anio = lector.leerEntero("Año: ");
									String mes = lector.leerString("Mes: (Primera letra en mayúscula)");
									int day = lector.leerEntero("Día: ");
									fechaInicio = lector.Fecha(anio, mes, day);
									// PlusDays método de localdate y suma los días que se indican a partir de la
									// inicio
									fechaFin = fechaInicio.plusDays(30);
									int opcionLibros = lector.prestarLibros("¿qué libro desea llevar?");

									switch (opcionLibros) {
									case 1:
										// Método estático que recorre los datos del las copias1
										if (!recorrerArrayCopias(copias1)) {
											System.out.println("No hay más copias disponibles de este libro");
										} else {
											for (CopiaLibros copi : copias1) {
												if (copi.getLugar() == EstadoCopia.BIBLIOTECA) {
													lector.Prestar(fechaInicio, fechaFin, copi, lector);
													cadena = "Se hizo el préstamo exitoso, devolución " + fechaFin;
													break;
												}
											}
										}
										System.out.println(cadena);

										break;
									case 2:
										if (!recorrerArrayCopias(copias2)) {
											System.out.println("No hay más copias disponibles de este libro");
										} else {
											for (CopiaLibros copi : copias2) {
												if (copi.getLugar() == EstadoCopia.BIBLIOTECA) {
													lector.Prestar(fechaInicio, fechaFin, copi, lector);
													cadena = "Se hizo el préstamo exitoso, devolución " + fechaFin;
												}
												break;
											}
										}
										System.out.println(cadena);
										break;
									case 3:
										if (!recorrerArrayCopias(copias3)) {
											System.out.println("No hay más copias disponibles de este libro");
										} else {
											for (CopiaLibros copi : copias3) {
												if (copi.getLugar() == EstadoCopia.BIBLIOTECA) {
													lector.Prestar(fechaInicio, fechaFin, copi, lector);
													cadena = "Se hizo el préstamo exitoso, devolución " + fechaFin;
												}
												break;
											}
										}
										System.out.println(cadena);
									}
								} else {
									System.out.println("Ya no se pueden relizar más préstamos");
								}
							}
						}
					}
				} else {
					System.out.println("¡Error! debe ingresar algo");
				}

				boolean respuesta = lector1.leerBooleano("¿Desea seguir con el menú? Si s - No n");
				if (respuesta) {
					bandera = true;
				} else {
					bandera = false;
				}
				break;
				
			case 2:
				String id1 = lector1.leerString("Ingrese el id del lector");
				if (!verificarLector(lectores, id1)) {
					System.out.println("¡Error! Lector no existe, verifie nuevamente");
				}

				else {
					for (Lector lector : lectores) {
						if (id1.equals(lector.getId())) {
							int libroPrestado = lector.prestarLibros("¿Qué libro va a devolver? ");
							switch (libroPrestado) {
							case 1:
								
								lector.devolver(fechaFin);
								copia1.setLugar(EstadoCopia.BIBLIOTECA);
								System.out.println("Se devolvió el libro con éxito " + copia1.getLibro().getNombre()
										+ " Id: " + copia1.getId());
								break;
							case 2:
								lector.devolver(fechaFin);
								copia2.setLugar(EstadoCopia.BIBLIOTECA);
								System.out.println("Se devolvió el libro con éxito " + copia2.getLibro().getNombre()
										+ " Id: " + copia2.getId());
								break;
							case 3:
								lector.devolver(fechaFin);
								copia3.setLugar(EstadoCopia.BIBLIOTECA);
								System.out.println("Se devolvió el libro con éxito " + copia3.getLibro().getNombre()
										+ "Id: " + copia3.getId());
								break;
							default:
								System.out.println("opción incorrecta");
								break;
							}
						}
					}
				}
				boolean respuesta2 = lector1.leerBooleano("¿Desea seguir con el menú? Si s - No n");
				if (respuesta2) {
					bandera = true;
				} else {
					bandera = false;
				}
				break;
			case 0:
				bandera = false;
				break;
			default:
				System.out.println("Error!!");
			}
		}
	 
	}
	
	public static boolean recorrerArrayCopias(ArrayList<CopiaLibros> datos) {
		boolean bandera = false;
		
		for(CopiaLibros copia1: datos) {
			if(copia1.getLugar() == EstadoCopia.BIBLIOTECA) {
				bandera = true;
				break;
			}else {
				bandera=false;
				
			}
		}
		return bandera;	
	}
	
	public static boolean verificarLector(ArrayList<Lector> lector,String id) {
		boolean bandera = false;
		for(Lector lectores: lector) {
			if(lectores.getId().equals(id)) {
				bandera = true;
				break;
			}
		}
		return bandera;
	}
	

	
	
	
	
}
