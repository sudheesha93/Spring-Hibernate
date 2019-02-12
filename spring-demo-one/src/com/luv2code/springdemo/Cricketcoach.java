package com.luv2code.springdemo;

public class Cricketcoach implements Coach {

	private FortuneService fortuneService;
	// add new fields for injecting literal values
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("cricketCoach-email setter method");

		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketCoach-team setter method");

		this.team = team;
	}

	
	
	public void CricketCoach() {
		System.out.println("cricket No-Arg constructor");
		
	}
	
	
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("cricketCoach-Fortune setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "CRICKET-daily workout method";
	}

	@Override
	public String getDailyFortune() {
		
		return "CRICKET-daily fortune service";
	}

}
