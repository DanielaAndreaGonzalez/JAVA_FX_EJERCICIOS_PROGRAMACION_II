package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class VentanaPrincipalControlador implements Initializable{

	@FXML
	private MenuItem btnSalir;
	
	@FXML
	private MenuItem btnAutor;
	
	@FXML 
	private void autor(ActionEvent evento) {
		try {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FormAutor.fxml"));
		
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.UTILITY);
			stage.setTitle("Agregar autor");
			stage.setScene(new Scene(root1));
			stage.showAndWait();
			
			
			
			
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@FXML
	public void salir(ActionEvent evento) {
		System.out.println("Hola Mundo");
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Esbozo de método generado automáticamente
		
	}
	
	
	
	
}
