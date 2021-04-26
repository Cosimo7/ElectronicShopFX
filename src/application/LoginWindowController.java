package application;
import model.*;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


//import javafx.stage.Stage;

/**
 * Login controller for the relative fxml document
 */

public class LoginWindowController {
	
	
	
	@FXML
	private Button userButton;
	
	@FXML
	private Button newUserButton;
	
	@FXML
	private Button employeeButton;
	
	@FXML
	private Label loginWarning;
	
	@FXML
	private TextField loginUsername;
	
	@FXML
	private TextField loginPassword;

	
	
	/**
	 * 
	 * @param event - this is the event triggered by user button 
	 * @throws IOException
	 */
	public void userLogin(ActionEvent event) throws IOException {
		
		checkLogin();
	}
	
	/**
	 * - this method let the user log with multiple controls
	 * @throws IOException
	 */
	public void checkLogin() throws IOException {
		
		Main m = new Main();
		User userOne = new User("cosimo", "0000", 0);
		
		if(loginUsername.getText().toString().equals(userOne.getUsername()) && 
				loginPassword.getText().toString().equals(userOne.getPassword())) {
			
			loginWarning.setText("Success");
			
			m.changeStage("UserWindow.fxml");
			
		
		} else if((loginUsername.getText().isEmpty() && loginPassword.getText().isEmpty())) {
				 
			loginWarning.setText("Please insert your username and password");
		
		} else {
			
			loginWarning.setText("Login failed");
		}
	}






}
