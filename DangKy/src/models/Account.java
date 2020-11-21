package models;

public class Account {

	private String firstName;
	private String lastName;
	private String email;
	private String pass;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String firstName, String lastName, String email, String pass) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", pass=" + pass
				+ "]";
	}
	
	
}
