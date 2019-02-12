package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1=context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
		
		context.close();
	}

}
