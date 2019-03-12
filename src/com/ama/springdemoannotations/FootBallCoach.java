package com.ama.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/* Setter Injection*/

@Component
@Scope("prototype")
public class FootBallCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public FootBallCoach() {
		
		System.out.println("FootBallCoach : >> this is football bean");
	}
	
	@Override
	public String getDailyFortune() {
		return "my lucky Day :: " + this.myFortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inject dependecies with a setter method");
		this.myFortuneService = fortuneService;
	}
	
	//@Autowired
	public void injectDependencies(FortuneService theFortuneService) {
		System.out.println(">> inject dependecies with a method");
		this.myFortuneService = theFortuneService;
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("FootBallCoach: inside method doMyStartupStuff");		
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("FootballCoach: inside method doMyCleanupStuff");		
	}
}
