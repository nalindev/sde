package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//start the transaction
			session.beginTransaction();
					
			List<Student> theStudent = session.createQuery("from Student").getResultList();
			
			displayStudents(theStudent);
			
			System.out.println("\n\nFetching stuednt name whose last name is kumar...");
			theStudent = session.createQuery("from Student s where s.lastName='kumar'").getResultList();
			
			displayStudents(theStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done...");
			
		}finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudent) {
		for(Student data : theStudent) {
			System.out.println(data);
		}
	}

}
