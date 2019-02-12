package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randonFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Default contrsucto-tenniscoach");
	}
	/*
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	*/
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public void doSomeCrazy(FortuneService fortuneService) {
		System.out.println("doSomeCrazy-tenniscoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCooach-workout mthod";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortunes();
	}

	

}
