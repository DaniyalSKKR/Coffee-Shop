import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class CoffeeShop extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Who want's coffee!!!");
		Parent root = FXMLLoader.load(getClass()
				.getResource("CoffeeGUI.fxml"));

		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add("style1.css");
		primaryStage.setScene(scene);
		primaryStage.show();

		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent t) {
				Platform.exit();
				System.exit(0);
			}
		});
		
		//Coffee order = new Caramel(new Sugar(new Cream( new ExtraShot(new BasicCoffee()))));
		
		//double cost = order.makeCoffee();
		//System.out.println("Total: "+cost);
	}

}
