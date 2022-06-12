package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		
		PaneOrganizer rootContainer = new PaneOrganizer();
		Scene escena = new Scene(rootContainer.getRoot(),400,500);
		
		
		primaryStage.setTitle("Menu");
		primaryStage.setScene(escena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

