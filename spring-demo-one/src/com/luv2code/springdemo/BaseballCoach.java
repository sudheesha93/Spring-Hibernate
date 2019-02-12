package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
  public BaseballCoach(FortuneService theFortuneService) {
		
	  fortuneService=theFortuneService;
	}
  public BaseballCoach() {
	  System.out.println("Baseball default constructor");
  }
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Baseball class-getdailywokout";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Baseball class-get daily fortune");
		return fortuneService.getFortune();
		
	}

}
