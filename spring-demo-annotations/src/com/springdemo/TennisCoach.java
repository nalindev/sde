package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component // Default Bean ID ( tennisCoach )
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	/*
	 * Spring will scan for a component that implements FortuneService interface.
	 * 
	 * 1. what if there are multiple FortuneService interface?
	 *    - Spring has support to handle this.  
	 */
	
	//Setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	/*
	constructor dependency injection using spring annotation
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	auto-wired using any method not just setter or constructor injection
	@Autowired
	public void doSomeCrazzyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
