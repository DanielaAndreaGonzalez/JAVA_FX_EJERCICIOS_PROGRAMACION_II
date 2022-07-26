package application;
	

import javafx.animation.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Button button = new Button("I'm here");
			
			Timeline t = new Timeline(
					new KeyFrame(Duration.seconds(0), new KeyValue(button.translateXProperty(), 0)),
					new KeyFrame(Duration.seconds(2), new KeyValue(button.translateXProperty(), 80))
				  );
			t.setAutoReverse(true);
			t.setCycleCount(Timeline.INDEFINITE);
			t.play();
					
			StackPane root = new StackPane();
			
			root.getChildren().add(button);
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
