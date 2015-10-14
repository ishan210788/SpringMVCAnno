package training.spring.annotation;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	@Size(min=3,max=20,message="Username must be between 3 and 20 characters long.")
	@Pattern(regexp="^[a-zA-Z0-9]+$", message = "Username must be alphanumeric with no spaces")
	private String username;
	  
	@Size(min=6,max=20,message="The password must be at least 6 characters long.")
	private String password;

	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9.-]+[.][A-Za-z]{2,4}", message="Invalid email address.")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		System.out.println("in set");
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
};