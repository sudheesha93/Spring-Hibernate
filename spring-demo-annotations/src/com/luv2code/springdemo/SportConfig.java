package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
	// define bean for fortues service
	@Bean
	public FortuneService SadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for swin and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(SadFortuneService());
		
	}

}
