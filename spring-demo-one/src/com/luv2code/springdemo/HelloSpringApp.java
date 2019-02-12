package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context
		=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the beans from the spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call the new methods on fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
