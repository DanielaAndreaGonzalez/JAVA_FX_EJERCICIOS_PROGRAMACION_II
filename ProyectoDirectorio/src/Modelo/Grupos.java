package Modelo;

import java.util.ArrayList;

/**
 * 
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Grupos {
	
	protected String nombre;
	protected ArrayList <Contacto> contacto;
	protected ArrayList <Grupos> grupos;
	
	
	public Grupos(String nombre, ArrayList<Contacto> contacto) {
		super();
		this.nombre = nombre;
		this.contacto = new ArrayList<>();
		this.grupos = new ArrayList<>();
	}


	public void asignarGrupos(Grupos grupo) {
		this.grupos.add(grupo);
	}
	
	
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
	 * @return el contacto
	 */
	public ArrayList<Contacto> getContacto() {
		return contacto;
	}
	/**
	 * @param contacto el contacto a establecer
	 */
	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}
	
	
	
	

}
