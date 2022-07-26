package Modelo;

import java.util.ArrayList;

/**
 * 
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Directorio {

	protected String nombre;
	protected Cuenta cuenta;
	protected ArrayList <Contacto> contacto;
	protected ArrayList <Grupos> grupos;
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta el cuenta a establecer
	 */
	public void addCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return el contacto
	 */
	public ArrayList<Contacto> getContacto() {
		return contacto;
	}
	/**
	 * @param contacto el contacto a establecer
	 */
	public void addContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}
	/**
	 * @return el grupos
	 */
	public ArrayList<Grupos> getGrupos() {
		return grupos;
	}
	/**
	 * @param grupos el grupos a establecer
	 */
	public void addGrupos(ArrayList<Grupos> grupos) {
		this.grupos = grupos;
	}
	public Directorio(String nombre, Cuenta cuenta, ArrayList<Contacto> contacto, ArrayList<Grupos> grupos) {
		super();
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.contacto = contacto;
		//this.grupos = grupos;
		grupos = new ArrayList <Grupos> ();
	}
	
	
	
	
	
}
