package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			int student_id = 1;
			System.out.println("Given ID: " + student_id);
			
			//start the transaction
			session.beginTransaction();
			
			Student theStudent = session.get(Student.class, student_id);
			System.out.println("data: " + theStudent);
			
			System.out.println("Updating student: ");
			theStudent.setFirstName("saurav");
			
			System.out.println("New data: " + theStudent);
			
			session.getTransaction().commit();
			System.out.println("done...");
			
		}finally {
			factory.close();
		}
	}

}
