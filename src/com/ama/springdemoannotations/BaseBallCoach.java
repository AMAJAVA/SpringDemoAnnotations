package com.ama.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* We use the default bean id since we did not use an explicit bean id ==> @Componen("explicit bean id")*/
@Component
public class BaseBallCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public BaseBallCoach(FortuneService fortuneService) {
		this.myFortuneService = fortuneService; 
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
