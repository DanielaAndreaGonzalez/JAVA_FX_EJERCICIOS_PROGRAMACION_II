module Biblioteca {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens controllers to javafx.graphics, javafx.fxml;
}
