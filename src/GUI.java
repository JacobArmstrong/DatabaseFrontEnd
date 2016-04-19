import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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
		HBox hboxTop = new HBox();
		hboxTop.setSpacing(10);
		bpane.setTop(hboxTop);
		
		//Create a new scrollpane and put it in the center of the borderpane
		//also, set the size of the scrollpane. we may need to change this in the future
		ScrollPane scrollpane = new ScrollPane();
		scrollpane.vbarPolicyProperty().set(ScrollBarPolicy.ALWAYS);
		scrollpane.hbarPolicyProperty().set(ScrollBarPolicy.AS_NEEDED);
		scrollpane.setMinHeight(800);
		scrollpane.setMaxHeight(800);
		scrollpane.setMinWidth(1200);
		scrollpane.setMaxWidth(1200);
		scrollpane.setFitToHeight(true);
		bpane.setCenter(scrollpane);
		
		//Create a new vbox and put it in the scrollpane
		VBox vboxCenter = new VBox();
		scrollpane.setContent(vboxCenter);
		
		//Create 5 buttons
		Button q1 = new Button("Query 1");
		Button q2 = new Button("Query 2");
		Button q3 = new Button("Query 3");
		Button q4 = new Button("Query 4");
		Button q5 = new Button("Query 5");
		
		//add the buttons to the top hbox
		hboxTop.getChildren().addAll(q1, q2, q3, q4, q5);
		
		//Set the event listeners on the buttons
		/*For for these events, a query should be made, and the results should be put into the center of the borderpane*/
		q1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				//clear out the center vbox
				vboxCenter.getChildren().clear();
				
				//Create new data
				Text t1 = new Text("This \n\nis \n\na \n\n\ntest");
				Text t2 = new Text("This \nis \nalso \na \n\n\n\ntest");
				
				//Add new data to the recently cleared vbox
				vboxCenter.getChildren().addAll(t1, t2);
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
