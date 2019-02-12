package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the final form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
// new controller method to read form data
// add data to model 
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
	
		//readthe request paramater from the HTMl form
		String theName=request.getParameter("studentName");
		
		// covert the data into uppercase
		theName=theName.toUpperCase();
		
		//create the message parameter
		String result="Yooo Yoo ! " + theName;
		
		// add the parameter to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
	
		@RequestParam("studentName") String theName, 
		Model model) {
		
		// convert the data into uppercase
		theName=theName.toUpperCase();
		
		//create the message parameter
		String result="Heyyyy Youu!  " + theName;
		
		// add the parameter to model
		model.addAttribute("message1", result);
		
		return "helloworld";
	}
	
	
}
