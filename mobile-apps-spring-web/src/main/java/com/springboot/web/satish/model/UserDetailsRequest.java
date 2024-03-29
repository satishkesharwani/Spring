package com.springboot.web.satish.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class UserDetailsRequest {

	@NotNull(message = "firstName is required")
	@Size(min = 2 , message = "firstName must not be less than 2 char")
	private String firstName;
	@NotNull(message = "lastName is required")
	@Size(min = 2 , message = "firstName must not be less than 2 char")
	private String lastName;
	@NotNull(message = "email is required")
	@Email
	private String email;
	@NotNull
	@Size(min = 1, max = 5, message = "password must be equals")
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
