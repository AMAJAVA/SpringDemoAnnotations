package com.ama.springdemojavaconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* Constructor Injection*/
/* We use the default bean id since we did not use an explicit bean id ==> @Componen("explicit bean id")*/
@Component
@Scope("singleton")
public class BaseBallCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	@Autowired
	public BaseBallCoach(@Qualifier("happyFortuneService")FortuneService theFortuneService) {
		System.out.println("BaseBallCoach :: >> this th baseball bean");
		this.myFortuneService = theFortuneService; 
	}
	
	@Override
	public String getDailyWorkout() {
		return "Essayer de marquer 3 coup francs direct!!!";
	}

	@Override
	public String getDailyFortune() {
		return "my lucky Day :: " + this.myFortuneService.getFortune();
	}

}
