package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.*;

public class FormAutorControlador implements Initializable{

	@FXML
	//Puede ser de cualquier tipo 
	ComboBox <String> txtGenero;
	@FXML
	Button btnGuardar;
	
	@FXML
	TextField txtnombre;
	
	@FXML
	private void guardar(ActionEvent evento) {
		
		String nombre = this.txtnombre.getText();
		String genero = this.txtGenero.getValue();
		System.out.println("Nombre: "+nombre + " genero: "+ genero);	
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
	
	public void inicializarDatos() {
		this.txtGenero.getItems().add("Masculino");
		this.txtGenero.getItems().add("Femenino");
		
	}
	
	
	

}
