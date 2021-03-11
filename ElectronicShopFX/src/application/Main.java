package application;

	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


/**
 * @param primaryStage - this is the window displayed 
 * @author - cosimo.romano@studenti.unipr.it
 */
public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			primaryStage.setResizable(false); //so  that the user can't resize the window
			Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Electronic Shop FX");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * method used to switch scene starting from primary window
	 * @param fxml
	 * @throws IOException
	 */
	public void changeScene(String fxml) throws IOException{
		
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
	
	/**
	 * launches the application
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
