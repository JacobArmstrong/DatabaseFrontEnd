import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class GUI extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Create a new scene
		Group root = new Group();
		Scene scene = new Scene(root);
		
		//Create a new borderpane and put it in the scene
		BorderPane bpane = new BorderPane();
		root.getChildren().add(bpane);
		
		//Create a new hbox and put it in the top part of the borderpane
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		bpane.setTop(hbox);
		
		//Create 5 buttons
		Button q1 = new Button("Query 1");
		Button q2 = new Button("Query 2");
		Button q3 = new Button("Query 3");
		Button q4 = new Button("Query 4");
		Button q5 = new Button("Query 5");
		
		//add the buttons to the hbox
		hbox.getChildren().addAll(q1, q2, q3, q4, q5);
		
		//Set the event listeners on the buttons
		/*For for these events, a query should be made, and the results should be put into the center of the borderpane*/
		q1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		q2.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		q3.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		q4.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		q5.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//put the scene in the stage
		stage.setScene(scene);
		//show the stage
		stage.show();
	}
}
