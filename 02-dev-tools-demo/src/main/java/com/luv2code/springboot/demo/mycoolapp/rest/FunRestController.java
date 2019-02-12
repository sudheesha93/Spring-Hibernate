package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return " Hello World ! Time: " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		return " Hello WorK Out everyday";
	}
	
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return " LUCKYY DAY!!!";
	}
}
