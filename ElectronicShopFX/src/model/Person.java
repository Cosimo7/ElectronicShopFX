package model;

public class Person {
	
	private String username;
    private String password;
    
    protected Person (String username, String password) {

        this.setUsername(username);
        this.setPassword(password);
        
    }

    //getters e setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
