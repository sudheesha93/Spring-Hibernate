package com.luv2code.AOPdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.AOPdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account acc, boolean vips) {
		System.out.println(getClass() + "ACCOUNT CLASS: DOING MY WORK: ADDING AN ACCOUNT");
	}
	
	public void doWork(Account acc, boolean vips) {
		System.out.println(getClass() + "ACCOUNT CLASS: DOING MY WORK: Yayyy..");
	}

}
