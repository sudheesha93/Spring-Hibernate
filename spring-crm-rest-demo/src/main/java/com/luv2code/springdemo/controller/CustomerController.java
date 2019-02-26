package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return custService.getCustomers();
	}
	
	@PostMapping("/customers")
	public void saveCustomer(@RequestBody Customer theCustomer) {
		theCustomer.setId(0);
		custService.saveCustomer(theCustomer);
		
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		
		Customer theCust= custService.getCustomer(id);
		if(theCust ==null) {
			throw new CustomerNotFoundException("Customer with given id not present" + id);
		}
		return theCust;
		
		
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer) {
	
		custService.saveCustomer(theCustomer);
		return theCustomer;
		
	}
	
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		Customer theCust = custService.getCustomer(id);
		if(theCust==null) {
			throw new CustomerNotFoundException("Customer not present with id :"+ id);
		}
		custService.deleteCustomer(id);
		return "Deleted Customer with id:" + id;		
	}
	

}
