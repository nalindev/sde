package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object
			System.out.println("Creating new session object...");
			Student tempStudent = new Student("nalin", "nishant", "nalinnishant@virtusa.com");
			
			//start the transaction
			session.beginTransaction();
					
			//save the student object
			System.out.println("saving the student...");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done...");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("The id of the previous transaction: " + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("My name is : " + myStudent.getFirstName() + " " + myStudent.getLastName());
			
			System.out.println("My email id : " + myStudent.getEmail());
			
		}finally {
			factory.close();
		}
	}

}
