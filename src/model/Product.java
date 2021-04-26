package model;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
	private SimpleStringProperty name;
	private SimpleStringProperty manufacturerName;
	private SimpleStringProperty technicalNotes;
	private SimpleIntegerProperty quantity;
	private SimpleDoubleProperty cost;


	public Product(String name, String manufacturerName, String technicalNotes, int quantity, double cost ) {
		this.name = new SimpleStringProperty(name);
		this.manufacturerName = new SimpleStringProperty(manufacturerName);
		this.technicalNotes = new SimpleStringProperty(technicalNotes);
		this.quantity = new SimpleIntegerProperty(quantity);
		this.cost = new SimpleDoubleProperty(cost);
	}

	
	public String getName() {
		return name.get();
	}

	
	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

	
	public String getManufacturerName() {
		return manufacturerName.get();
	}

	
	public void setManufacturerName(SimpleStringProperty manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	
	public String getTechnicalNotes() {
		return technicalNotes.get();
	}

	
	public void setTechnicalNotes(SimpleStringProperty technicalNotes) {
		this.technicalNotes = technicalNotes;
	}


	public int getQuantity() {
		return quantity.get();
	}


	public void setQuantity(SimpleIntegerProperty quantity) {
		this.quantity = quantity;
	}

	
	public double getCost() {
		return cost.get();
	}


	public void setCost(SimpleDoubleProperty cost) {
		this.cost = cost;
	}
}