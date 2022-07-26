package Modelo;

import java.util.ArrayList;

public class Contacto {
	
	protected String nombre;
	protected String telefono;
	protected String email;
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
	 * @return el telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email el email a establecer
	 */
	public void setEmail(String email) {
		this.email = email;
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
	public void setGrupos(ArrayList<Grupos> grupos) {
		this.grupos = grupos;
	}
	public Contacto(String nombre, String telefono, String email, ArrayList<Grupos> grupos) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		//this.grupos = grupos;
		grupos = new ArrayList<>();
	}
	
	
	
	
	

}
