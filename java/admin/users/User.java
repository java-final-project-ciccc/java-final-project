package ca.java.admin.users;

public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public User(String firstName, String lastName, String email, String password) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName.isEmpty() || firstName.equalsIgnoreCase(null)) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;
		}
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName.isEmpty() || lastName.equalsIgnoreCase(null)) {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;
		}
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (email.isEmpty() || email.equalsIgnoreCase(null)) {
			this.email = "Unknown";
		} else {
			this.email = email;
		}
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		if (password.isEmpty() || password.equalsIgnoreCase(null)) {
			this.password = "Unknown";
		} else {
			this.password = password;
		}
	}
	
	@Override
	public String toString() {
		return "First Name: " + this.firstName +
				" Last Name: " + this.lastName +
				" Email: " + this.email +
				" Password(temp): " + this.password;
	}
	
}
