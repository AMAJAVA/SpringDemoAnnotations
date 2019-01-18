package com.ama.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file ==> create spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Spring Container
		BaseBallCoach baseBallBean = context.getBean("baseBallCoach", BaseBallCoach.class);
		
		// use the bean
		System.out.println(baseBallBean.getDailyWorkout());
		System.out.println(baseBallBean.getDailyFortune());
		
		//close context
		context.close();
	}
}
