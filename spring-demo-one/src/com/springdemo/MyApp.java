package com.springdemo;

/*
 * Spring container - primary functions
 *   1. Create and manage objects (Inversion of control)
 *   2. Inject object's dependencies (Dependency injection)
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
 *         
 *
 * Check SpringHelloApp.java file for spring Bean use cases.
 */

/*
 * The Two most common dependency injection are - 
 *    1. Constructor injection
 *    2. Setter Injection
 *    3. auto-wiring
 */


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
 *    3. request - scoped to an HTTP web req. ( only used for web app )
 *    4. session - scoped to an HTTP web session. ( only used for web app )
 *    5. global-session - scoped to global HTTP web session. ( only used for web app )
 *    
 * Bean Lifecycle - 
 *    Container started -> Bean instantiated -> Dependencies injected -> Internal spring processing -> your custom init method -> Ready to use
 *    
 *    - we can add custom code during bean initialization ( setting up handles to db, sockets, file etc )
 *      - <bean id="myCoach" class="com.springdemo" init-method="doMyStartupStuff"></bean>
 *    
 *    - we can also add custom code during bean destruction (clean up handles to resources db, sockets etc ) .
 *      - <bean id="myCoach" class="com.springdemo" destroy-method="doMyStartupStuff"></bean>
 *      
 *      
 * NOTE -> for "prototype" scoped beans, spring never call the destroy method.
 */
public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
