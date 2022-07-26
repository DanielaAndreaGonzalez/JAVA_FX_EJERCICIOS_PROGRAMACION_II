package co.uniquindio.view;

import java.io.IOException;


import co.uniquindio.address.model.Empleado;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {
	private Stage escenarioPrincipal;
	private BorderPane layoutRaiz;
	private Empleado miEmpleado;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		miEmpleado = new Empleado();
		this.escenarioPrincipal = primaryStage;
		this.escenarioPrincipal.setTitle("Aplicación sobre un Empleado");
		inicializarLayoutRaiz();
		mostrarVistaPersona();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void inicializarLayoutRaiz() {
		try {
			FXMLLoader cargador = new FXMLLoader();
			cargador.setLocation(Principal.class.getResource("view/LayaoutRaiz.fxml"));
			layoutRaiz = (BorderPane) cargador.load();
			// Muestra la escena que contiene el rootLayaout
			Scene scene = new Scene(layoutRaiz);
			escenarioPrincipal.setScene(scene);
			escenarioPrincipal.show();
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getMessage());
		}	
	}
/**
 * Shows the person overview the root layout
 */
	public void mostrarVistaPersona() {
		try {
		//Carga la vista de la persona.
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Principal.class.getResource("EmpleadoVista.fxml"));
		AnchorPane vistaPersona = (AnchorPane) loader.load();
		
		//Fija la vista de la persona en el centro del root layout
		layoutRaiz.setCenter(vistaPersona);
		//Acceso al controlador.
		ControladorEmpleado miControlador = loader.getController();
		miControlador.setMiVentanaPrincipal(this);
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Stage getPrimaryStage() {
		return escenarioPrincipal;
	}
	public static void main(String[] args) {
		Application.launch(Principal.class,args);
	}
	
	public void inicializarEmpleado(String id, String nombre,String direccion,String ciudad) {
		miEmpleado.fijarEmpleado(id, nombre, direccion, ciudad);
		System.out.println(miEmpleado.toString());
	}
	
	public String obtenerNombre() {
		return miEmpleado.getNombre();
	}
	
}
