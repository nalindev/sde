package com.springdemo;

public class CricketCoach implements Coach {

	private HappyFortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// create no-arg constructor
	CricketCoach() {}
	
	// create getter method
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//create setter method to set fortuneservice
	public void setFortuneService(HappyFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//we used override annotation because it is already declared in interface class and we are overriding it here.
	@Override
	public String getDailyWorkout() {
		return "Practice fast Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return getFortuneService();
	}

}
