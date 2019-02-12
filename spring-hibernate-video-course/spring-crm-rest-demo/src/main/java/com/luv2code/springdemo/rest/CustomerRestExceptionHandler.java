package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// add an exception for customernotfound
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException ex){
		// CREATE customer errror response
		CustomerErrorResponse error= new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
		
		// return the response entity
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		
	}
	
	// add another exception handler..to catch all other exceptions
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception ex){
		// CREATE customer errror response
		CustomerErrorResponse error= new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), System.currentTimeMillis());
		
		// return the response entity
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		
		
	}
}



