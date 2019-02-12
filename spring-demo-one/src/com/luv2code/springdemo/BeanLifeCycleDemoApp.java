package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
		
	// load the config file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	
		// retreive the bean
		Coach coach1= context.getBean("myCoach", Coach.class);
		
		
		// check whetehr they are equal
		System.out.println(coach1.getDailyWorkout());
		
		//close th file
		context.close();
	}

}
