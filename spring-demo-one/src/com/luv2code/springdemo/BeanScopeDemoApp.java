package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		
	// load the config file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
		// retreive the bean
		Coach coach1= context.getBean("myCoach", Coach.class);
		Coach coach2= context.getBean("myCoach", Coach.class);
		
		
	// call the methods
		boolean result=(coach1==coach2);
		System.out.println("RESULT " + result);
		System.out.println("MEM 1 " + coach1);
		System.out.println("MEM 2 " + coach2);
		
		//close th file
		context.close();
	}

}
