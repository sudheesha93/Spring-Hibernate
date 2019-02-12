package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("SportConfig.class");
		
		Coach coach1=context.getBean("swimCoach", Coach.class);
		
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
		
		context.close();
	}

}
