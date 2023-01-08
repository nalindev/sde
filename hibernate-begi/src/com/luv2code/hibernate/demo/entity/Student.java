package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * ORM - Object Relational mapping
 * 
 * Entity Class - Java Class that is mapped to a database table.
 * 
 * Two option for mapping Java class to database - 
 * 1. xml config file(legacy)
 * 2. java annotation(modern)
 */

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	public Student() {}

	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	};
	
	/*
	Why we are using JPA Annotation instead of Hibernate ?

	For example, why we are not using this org.hibernate.annotations.Entity?

	ANSWER:
	JPA is a standard specification. Hibernate is an implementation of the JPA specification.

	Hibernate implements all of the JPA annotations.

	The Hibernate team recommends the use of JPA annotations as a best practice.


	 */
}
