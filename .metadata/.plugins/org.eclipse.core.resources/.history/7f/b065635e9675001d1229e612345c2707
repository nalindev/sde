package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 1. why do we specify the Coach interface in getBean()?
 *    
 *    ex - Coach theCoach = context.getBean("myCoach", Coach.class);
 *        
 *    - When we pass the interface to the method, behind the scenes Spring will cast the objects for us.
 *    ~ search more on google
 */

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
