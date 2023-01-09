package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			
			int student_id = 1;
			Student theStudent = session.get(Student.class, student_id);
			
			System.out.println(theStudent);
			
//			session.delete(theStudent);
//			System.out.println("done...");
			
			System.out.println("Deleting using query parameter...");
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
	}

}
