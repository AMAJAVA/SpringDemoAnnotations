package com.ama.springdemojavaconfiguration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	/*
	 * 	Reference Values from properties file
	 */
	@Value("${foo.email}")
	private String email ;
	
	@Value("${foo.team}")
	private String team ;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.myFortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return ">> SwimCoach :: " + myFortuneService.getFortune();
	}

}
