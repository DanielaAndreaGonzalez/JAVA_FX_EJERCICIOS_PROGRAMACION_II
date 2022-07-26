package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.*;

public class SampleController {
	@FXML
	private TextField TextCampos1;

	// Event Listener on Button.onAction
	@FXML
	public void btnOkclick(ActionEvent event) {
		
		Stage MainWindow = (Stage) TextCampos1.getScene().getWindow(); 
		String title = TextCampos1.getText();
		MainWindow.setTitle(title);
		
	}
	
	
}
