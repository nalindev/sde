package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * singleton bean scope -
 *   - it is default scope
 *   - spring container creates only one instance of the bean, by default
 *   - it is cached in memory 
 *   - all request for the bean will return a SHARED reference of the same bean.
 *   
 *   scope="singleton" in bean xml file
 *   
 */

/*
 * Spring bean scopes - 
 *    1. singleton - creates a single shared instance of the bean. Default scope.
 *    2. prototype - creates a new bean instances for each container request.
 *    3. request - scoped to an HTTP web req. ( only used for web apps )
 *    4. session - scoped to an HTTP web session. ( only used for web apps )
 *    5. global-session - scoped to global HTTP web session. ( only used for web apps )
 */

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout() + "\n" + theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress() + "\n" + theCoach.getTeam());
		
		context.close();

	}

}
