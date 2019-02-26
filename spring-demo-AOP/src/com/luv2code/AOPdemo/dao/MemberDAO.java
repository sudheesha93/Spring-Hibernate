package com.luv2code.AOPdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	public void addAccount() {
		
		System.out.println(getClass() + "MEMBER CLASS: DOING MY WORK: ADDING AN ACCOUNT");
	
		
	}
	
public void GoToSleep() {
		
		System.out.println(getClass() + "MEMBER CLASS: SLEEP METHODD ");
	
		
	}

}