package com.springdemo;

public class TrackCoach implements Coach {

    FortuneService theFortuneService;
	
	TrackCoach(FortuneService theFortuneService){
		this.theFortuneService = theFortuneService;
	}
	
	TrackCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + theFortuneService.getFortune();
	}

}
