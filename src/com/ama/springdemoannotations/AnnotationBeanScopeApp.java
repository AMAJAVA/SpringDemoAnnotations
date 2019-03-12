package com.ama.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
	
	public static void main(String[] args) { 
		// create spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container 
		FootBallCoach firstCoachBean = context.getBean("footBallCoach", FootBallCoach.class);

		// Test Scope 
		System.out.println(firstCoachBean.hashCode());

		// close context
		context.close();
	}

}
