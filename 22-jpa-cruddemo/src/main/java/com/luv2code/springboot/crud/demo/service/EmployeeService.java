package com.luv2code.springboot.crud.demo.service;

import java.util.List;

import com.luv2code.springboot.crud.demo.entity.Employee;

public interface EmployeeService {
	
public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void saveOrUpdates(Employee employee);
	
	public void delete(int id);

}
