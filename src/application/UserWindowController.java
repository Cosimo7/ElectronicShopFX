package application;
import model.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * User window controller for the relative fxml document
 * @author Cosimo
 *
 */
public class UserWindowController implements Initializable {
	
	//calling all user table columns
	@FXML 
	private TableView<Product> tableView;
	@FXML 
	private TableColumn<Product, String> nameColumn;
	@FXML 
	private TableColumn<Product, String> manufacturerNameColumn;
	@FXML 
	private TableColumn<Product, String> technicalNotesColumn;
	@FXML 
	private TableColumn<Product, String> quantityColumn;
	@FXML 
	private TableColumn<Product, String > costColumn;
	
	/**
	 * Initialize user shop table
	 * @param url
	 * @param rb
	 */
	public void initialize(URL url, ResourceBundle rb) {
		
		nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		manufacturerNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("manufacturerName"));
		technicalNotesColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("technicalNotes"));
		quantityColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("quantity"));
		costColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("cost"));
		
		
		tableView.setItems(getProducts());
	}
	
	
	/**
	 * This method returns a list Products ObservableList
	 * @return
	 */
	public ObservableList<Product> getProducts(){
		
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Iphone X", "Apple", "high performance", 3, 555.55));
		products.add(new Product("mi9", "Xiaomi", "very good", 6, 293.54));
		products.add(new Product("P10", "Huawei", "high performance", 7, 554.55));
	
		return products;
	}
	
	

	
	

}

//TODO search bar by name and manufacturer name 
//TODO purchase button, decrease quantity-> if 0 after purchase notify to the employee
//TODO if no items request quantity to the employee and notify if it is available 
//TODO return login stage
//TODO notification i balance is lower than product price 