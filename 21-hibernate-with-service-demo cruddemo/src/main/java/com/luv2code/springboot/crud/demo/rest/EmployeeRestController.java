package com.luv2code.springboot.crud.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.crud.demo.dao.EmployeeDAO;
import com.luv2code.springboot.crud.demo.entity.Employee;
import com.luv2code.springboot.crud.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	private EmployeeRestController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee theEmp= employeeService.findById(id);
		
		if(theEmp==null) {
			throw new RuntimeException(" Employee not found with id :" + id);
		}
		
		return theEmp;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmpl) {
		
		theEmpl.setId(0);
		employeeService.saveOrUpdates(theEmpl);
		return theEmpl;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		employeeService.saveOrUpdates(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{id}")
	public String updateEmployee(@PathVariable int id) {
		Employee emp=employeeService.findById(id);
		if(emp==null) {
			throw new RuntimeException(" Emplyee not found id:"+ id);
		}
		employeeService.delete(id);
		return " Employee deleted with id: " + id;
		
	}
	
	
	
}
