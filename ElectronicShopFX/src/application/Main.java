package application;

	
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 *This application runs two main stages: 
 *-In the primaryStage will be displayed just the login window
 *-In the secondaryStage will be displayed the rest of the application  
 * 
 * @param primaryStage - first stage opened in the application
 * @author - cosimo.romano@studenti.unipr.it
 */
public class Main extends Application {
	
	private static Stage primaryStage; 
	private static Stage secondaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setResizable(false); //so  that the user can't resize the window
			Parent root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Electronic Shop FX");
			primaryStage.setScene(scene);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param fxml
	 * @throws IOException
	 */
	public void changeStage(String fxml) throws IOException{
		try {
			
			Stage secondaryStage = new Stage();
			FXMLLoader fxmlLoader = new FXMLLoader();
			Pane root = fxmlLoader.load(getClass().getResource(fxml).openStream());
			secondaryStage.setScene(new Scene(root, 900, 700));
			secondaryStage.setTitle("Electronic Shop FX");
			secondaryStage.showAndWait();
			primaryStage.hide();
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	/**
	 * method used to switch scene starting from secondary window
	 * @param fxml
	 * @throws IOException
	 */
	public void changeScene(String fxml) throws IOException{
		
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		secondaryStage.getScene().setRoot(pane);
	}
	
	/**
	 * launches the application
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
