package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button button = new Button ("Say 'Hello world'" );

			button.setOnAction(e -> { 
					Alert alert = new Alert(AlertType.INFORMATION, "Hello world");
					alert.showAndWait();
			});
			
			//RadioButton radio1 = new RadioButton();
			//radio1.setText("Select me!!");
			//RadioButton radio2 = new RadioButton("Or me");
			//Image image = new Image("ok.jpg");	
			//radio1.setGraphic(new ImageView(image));
			
			//button.setGraphic(new ProgressBar(-1));
			//button.setGraphic(new Button ("Nested button"));
			
			StackPane root = new StackPane();
			root.getChildren().add(button);
			
			
			//root.getChildren().add(radio1);
			//root.getChildren().add(radio2);
			
			Scene scene = new Scene(root,500,300);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(Main.class,args);
	}
}
