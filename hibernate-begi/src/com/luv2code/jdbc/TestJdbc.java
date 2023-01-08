package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		/*
		 * Hibernate - A framework for saving java objects in a database.
		 * 
		 * benefits -
		 * 1. Hibernate handle all of the low level sql
		 * 2. Minimizes the amount of JDBC code you have to develop
		 * 3. Hibernate provides the object-Relational mapping (ORM)
		 * 
		 * 
		 * URL used in source - jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false
		 */
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";

		try {
		
			System.out.println("Connecting to databse: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful!");
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
