package com.springdemo;

/*
 * Spring container - primary functions
 *   1. Create and manage objects (Inversion of control)
 *   2. Inject object's dependencies (Dependency injection
 *   
 * Configuring Spring Container (3 ways)
 *   1. XML configuration file (legacy, but most legacy apps still use this)
 *   2. Java Annotaions (modern)
 *   3. Java source code (modern)
 *   
 * Spring Development process
 *   1. Configure spring beans
 *   2. Create spring container ( Known as ApplicatonContext )
 *   3. Retrieve Beans from Spring Container
 */

/*
 * Spring Bean - it is simply a java object
 * 			   - when java objects are created by the spring container, then spring refers to them as "Spring Beans".
 * 
 *         Def - In spring, the objects that form the backbone of your application and that are managed by the spring IOC container are called beans.
 */

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
