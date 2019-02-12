package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retreive the bean from the spring contaienr
		Cricketcoach theCoach=context.getBean("myCricketCoach",Cricketcoach.class);
	
		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println();
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the content
context.close();
	}

}
