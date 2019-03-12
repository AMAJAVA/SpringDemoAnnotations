package com.ama.springdemojavaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file ==> create spring Container from java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve bean from Spring Container
		//BaseBallCoach baseBallBean = context.getBean("baseBallCoach", BaseBallCoach.class);
		Coach swimBean = context.getBean("swimCoach", SwimCoach.class);
		
		// use the bean
		//System.out.println(baseBallBean.getDailyWorkout());
		//System.out.println(baseBallBean.getDailyFortune());
		
		System.out.println(swimBean.getDailyFortune());
		System.out.println("My email is : " + ((SwimCoach)swimBean).getEmail());
		System.out.println("My team is : " + ((SwimCoach)swimBean).getTeam());
		
		//close context
		context.close();
	}
}
