package com.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component // Default Bean ID ( tennisCoach )
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
