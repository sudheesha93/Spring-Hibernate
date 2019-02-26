package com.luv2code.AOPdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MemberDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		// read the spring config file
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from the comfig class
		AccountDAO accDao=context.getBean("accountDAO", AccountDAO.class);
		//call the business method
		Account acc= new Account();
		accDao.addAccount(acc, true);
		accDao.doWork(acc, false);
		
		System.out.println("call it AGAINNNN...!!!");
		
		
		MemberDAO memDao=context.getBean("memberDAO", MemberDAO.class);
		//call the business method
		memDao.addAccount();
		memDao.GoToSleep();
		// close the context
		context.close();

	}

}
