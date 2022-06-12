package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

	private Button boton1;
	private Button boton2;
	private Button boton3;
	private GridPane root;
	
	public PaneOrganizer() {
		
		createContent();
	}
	
	public Pane getRoot() {
		
		return root;
	}
	
	public void createContent() {
		
		root = new GridPane();
		boton1 = new Button("Rojo");
		boton2 = new Button("Azul");
		boton3 = new Button("Verde");
		
		root.add(boton1, 0, 0);
		root.add(boton2, 0, 1);
		root.add(boton3, 0, 2);
		
		root.setHgap(10);
		root.setVgap(10);
		
		root.setAlignment(Pos.CENTER);
		
		root.setPadding(new Insets(20,20,20,20));
		
		
		
		
		
		boton1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				
				root.setStyle("-fx-background-color:red");;
			}
		});
		
		
		boton2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				root.setStyle("-fx-background-color:blue");
				
			}
		});
		
		
		boton3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				root.setStyle("-fx-background-color:green");
			}
		});
		
	}
}
