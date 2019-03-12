package com.ama.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file ==> create spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring Container
		BaseBallCoach baseBallBean = context.getBean("baseBallCoach", BaseBallCoach.class);
		FootBallCoach footBallBean = context.getBean("footBallCoach", FootBallCoach.class);
		HandBallCoach handBallBean = context.getBean("handBallCoach", HandBallCoach.class);
		
		// use the bean
		System.out.println(baseBallBean.getDailyWorkout());
		System.out.println(baseBallBean.getDailyFortune());
		
//		// use the Bean FootBallCoach
		System.out.println(footBallBean.getDailyFortune());
//		
//		// use the Bean HandBallCoach
		System.out.println(handBallBean.getDailyFortune());
		System.out.println("Email : " + handBallBean.getEmail());
		System.out.println("Team : " + handBallBean.getTeam());
		//close context
		context.close();
	}
}
