package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandonFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"aaaaaaaaaaaa", "ssssssssssss", "ddddddddd"
	
	};
	 private Random myRandom= new Random();
	
	@Override
	public String getFortunes() {
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
	}

}
