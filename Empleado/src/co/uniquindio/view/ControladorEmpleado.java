package co.uniquindio.view;

import co.uniquindio.view.Principal;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

/**
 * Permite editar los datos de la persona
 * @author DanielaAGonzalezH
 *
 */
public class ControladorEmpleado {

	private TextField idTextField;
	private TextField nombreTextField;
	private TextField direccionTextField;
	private TextField ciudadTextField;
	private Button guardarButton;
	private Button consultarNombreButton;
	//para manera el botón
	private boolean cliqueado = false;
	
	//VentanaPrincipal
	private Principal miVentanaPrincipal;
	
	/**
	 * Inicializa la clase contenedor
	 */
	private void initialize() {}
	/**
	 * Método modificador
	 * @return
	 */
	public Principal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	
	public void setMiVentanaPrincipal(Principal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	/**
	 * Retorna verdadero si el usuario dio clic sobre el botón
	 * @return
	 */
	public boolean isCliqueado() {
		return cliqueado;
	}
	/**
	 * Método para modificar la persona
	 */
	@FXML
	private void fijarPersona() {
		String id = idTextField.getText();
		String nombre = nombreTextField.getText();
		String direccion = direccionTextField.getText();
		String ciudad = ciudadTextField.getText();
		miVentanaPrincipal.inicializarEmpleado(id, nombre, direccion, ciudad);
		cliqueado = true;
		
		
	}
	/**
	 * Se invoca cuando el usuario de clic en consultar nombre
	 */
	@FXML
	private void obtenerNombre() {
		
		String nombre = miVentanaPrincipal.obtenerNombre();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Consultar nombre del estudiante");
		alert.setContentText(nombre);
		alert.setHeaderText(null); // Sin titulo interno
		alert.initStyle(StageStyle.UTILITY);
		alert.showAndWait(); // Se muestra la ventana	
	}
	
	
	
	
	
}
