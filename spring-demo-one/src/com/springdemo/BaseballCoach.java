package com.springdemo;

public class BaseballCoach implements Coach {
	
	FortuneService theFortuneService;
	
	BaseballCoach(FortuneService theFortuneService){
		this.theFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}
}
