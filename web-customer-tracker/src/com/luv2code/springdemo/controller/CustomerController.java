package com.luv2code.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;

import java.util.List;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject DAO into the controller
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	
	{
		//get customers from DAO
		List<Customer> theCustomers=customerservice.getCustomers();
		
		// add costomers to model
		theModel.addAttribute("customers",theCustomers);
		return "list-customers";
	}
	
	
	@GetMapping("showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// create model atttribute to bind the data
		Customer theCustomer= new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@PostMapping("saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// saev the customer using service
		customerservice.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
			Model theModel) {
		
		// get the customer from the service
		Customer theCustomer=customerservice.getCustomer(theId);
		
		// set customer to model attribute to prepopulate
		theModel.addAttribute("customer", theCustomer);
		
		// send over th the form
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerservice.deleteCustomer(theId);
		return "redirect:/customer/list";
		
	}

}
