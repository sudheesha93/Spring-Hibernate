package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortunes() {
		
		return "Sad fortune service-get fortune method";
	}

}
