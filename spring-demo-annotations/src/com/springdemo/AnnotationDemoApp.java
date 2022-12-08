package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* Java annotation 
*   - special labels/markers added to java classes
*   - provide meta-data about the class
*   - processed at compile time or run-time for special processing
*          example - @Override
*
*
* why spring configuration with Annotation 
*   - XML configuration can be verbose
*   - configure your spring beans with Annotation
*   - Annotations minimizes the XML configuration
*
* once you added Annotations to a class then spring automatically scan your java classes and when it finds the class that has special spring annoation on it. it will automatically register bean with the container.
*
* Development process -
*   - Enable component scanning in spring configuration file
*   - Add the @Component annotation to your java classes
*   - Retrieve bean from spring container
*
*
* Default Bean ID - spring also support defaults bean ID
*                 - the class name, make first letter lower-case.
*                 - @Component - don't need to provide ID within ("")
*/

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
