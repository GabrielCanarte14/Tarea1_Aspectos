import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public aspect ObserverProtocol {
	
	pointcut inicio() : execution(* start(..));
	
	before() : inicio(){
		System.out.println("Se esta iniciando el programa");
	}
	
	
	pointcut changeColor(GridPane root) : call(* setStyle(*) ) && target (root);
	
	after(GridPane root) : changeColor(root){
		String color = root.getStyle();
		color = color.replace("-fx-background-color:","");
		System.out.println("Nuevo color de la pantalla: "+color.toUpperCase());
	}
}
