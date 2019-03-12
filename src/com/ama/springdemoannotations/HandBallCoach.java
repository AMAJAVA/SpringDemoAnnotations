package com.ama.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* Field Injection*/
@Component
public class HandBallCoach implements Coach{
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService myFortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public HandBallCoach() {
		System.out.println(">> HandBallCoach:: this is handball bean");
	}
	
	@Override
	public String getDailyFortune() {
		return "my handball Day :: " + this.myFortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
}
