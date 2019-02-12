package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "SwimCoach-getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		
		return "SwimCoach-getDailyFortune";
	}

}
