package model;

public class User extends Person {
	private double balance;
	
	//private Product emptyProduct = new Product("","","", 0, 0);
	
	public User(String username, String password, double balance) {
		super(username, password);
		this.balance = balance;
	}
	
	public double GetBalance(){
		return balance;
	}

    public void SetBalance(double sb){
        this.balance = sb;
    }
		
}
