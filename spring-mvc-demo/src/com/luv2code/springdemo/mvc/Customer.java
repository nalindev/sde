package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
Dependency - Validation (Bean Validation with Hibernate validator)

@NotNull - checks that the annoted value is not null
@Min     - Must be a number >= value
@Max     - Must be a number <= value
@Size    - Size must match the given size
@Pattern - Must match a regular expression pattern
@Future / @Past - Date must be in future or past of given date


ORM - Object relational mapping 
*/

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1)
	private String lastName;
	
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
	
	
}
