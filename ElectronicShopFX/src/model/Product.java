package model;

public class Product {
	private String name;
	private String manufacturerName;
	private String technicalNotes;
	private int quantity;
	private double cost;


	protected Product(String name, String manfacturerName, String technicalNotes, double cost, String manufacturerName, int quantity) {
		this.name = name;
		this.manufacturerName = manufacturerName;
		this.technicalNotes = technicalNotes;
		this.quantity = quantity;
		this.cost = cost;
	}


	public String getName() {
		return name;
	}


	public String getManufacturerName() {
		return manufacturerName;
	}


	public String getTechnicalNotes() {
		return technicalNotes;
	}


	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}