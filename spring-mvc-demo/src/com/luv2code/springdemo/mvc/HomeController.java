package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller class
@Controller
public class HomeController {
	
	// controller method with req mapping 
	@RequestMapping("/")
	public String showPage() {
		// return the view name
		return "main-menu";
	}

}
