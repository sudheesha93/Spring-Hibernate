package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	// add an initbinder...to trim input strings
	//remove whitespaces
	//resolve issue for our validtion
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// adding an empty customer object to the model attribute
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult){
		
		System.out.println("FIRST NAME: " + theCustomer.getFirstName());
		System.out.println("LAST NAME: " + theCustomer.getLastName());
		
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
	
	}
	
		
}
