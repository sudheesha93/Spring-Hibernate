package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	// autowire the customerservice
	@Autowired
	private CustomerService customerService;
	
	
	// add mapping to get the customers
	@RequestMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getCustomers();		
	}
	
	// add mapping to get the customer by ID
	@RequestMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId){
		Customer theCust=customerService.getCustomer(customerId);
		if(theCust==null) {
			throw new CustomerNotFoundException("Customer id not found -" + customerId);
		}
		
		return theCust;
	}
	// adding new customer
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer theCustomer) {
		// also just in case the pass an id in JSON...set id to 0
		theCustomer.setId(0);
		customerService.saveCustomer(theCustomer);
		return theCustomer;
		
	}
	// updating the customer
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		return theCustomer;
		
	}
	
	// delete the customer by ID
		@DeleteMapping("/customers/{customerId}")
		public String deleteCustomer(@PathVariable int customerId){
			
			Customer theCust=customerService.getCustomer(customerId);
			if(theCust==null) {
				throw new CustomerNotFoundException("Customer id not found -" + customerId);
			}
			
			customerService.deleteCustomer(customerId);
			return "deleted customer ID : " + customerId;

		}

}
