package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {
	private GridPane layoutRaiz;
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader cargador = new FXMLLoader();
			cargador.setLocation(Principal.class.getResource("pruebaVista.fxml"));
			layoutRaiz = (GridPane) cargador.load();
			
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(Principal.class,args);
	}
}
