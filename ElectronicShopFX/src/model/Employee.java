package model;

public class Employee extends Person {
	
	private Product emptyProduct = null;
	
	private Employee(String username, String password) {
		super(username, password);
	}

	public Product getEmptyProduct() {
		return emptyProduct;
	}

	public void setEmptyProduct(Product emptyProduct) {
		this.emptyProduct = emptyProduct;
	}
}
