package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

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
			
			/*
			 * update email of all student using querying
			 */
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("update email for all student: ");
			session.createQuery("update Student set email='fck@spring.com'").executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("done...");
			
		}finally {
			factory.close();
		}
	}

}
