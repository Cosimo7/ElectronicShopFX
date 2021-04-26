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
	
	private static Stage pStage; 
	private static Stage sStage; //TODO better define this variable 
	
	@Override
	public void start(Stage primaryStage) {
		try {
			setPrimaryStage(primaryStage);
			pStage = primaryStage;
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
	

    public static Stage getPrimaryStage() {
        return pStage;
    }
	
	private void setPrimaryStage(Stage pStage) {
		Main.pStage = pStage;
	}

	/**
	 * method used to open the secondary stage after user login
	 * @param fxml
	 * @throws IOException
	 */
	public void changeStage(String fxml) throws IOException{
		try {
			pStage.close();
			Stage secondaryStage = new Stage();
			FXMLLoader fxmlLoader = new FXMLLoader();
			Pane root = fxmlLoader.load(getClass().getResource(fxml).openStream());
			secondaryStage.setScene(new Scene(root, 900, 700));
			secondaryStage.setTitle("Electronic Shop FX");
			secondaryStage.showAndWait();
			
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
		sStage.getScene().setRoot(pane);
	}
	
	/**
	 * Launches the application
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
