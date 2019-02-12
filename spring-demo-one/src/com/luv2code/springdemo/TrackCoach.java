package com.luv2code.springdemo;



public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
	System.out.println("Track Coach- Default constructor");
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		super();
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
			return "TrackCoach class getdailyWorkOut method";
	}
	@Override
	public String getDailyFortune()
	{
		
		return "Trackcoach class-get daily fortune" + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach- Start up method");
	}
	
	// add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("Track Coach- clean up method");
	}
}
