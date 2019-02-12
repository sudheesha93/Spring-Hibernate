package com.luv2code.springboot.crud.demo.dao;

import java.util.List;

import com.luv2code.springboot.crud.demo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void saveOrUpdates(Employee employee);
	
	public void delete(int id);

}
