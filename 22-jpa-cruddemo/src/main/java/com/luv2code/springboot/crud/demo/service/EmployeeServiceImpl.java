package com.luv2code.springboot.crud.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.crud.demo.dao.EmployeeDAO;
import com.luv2code.springboot.crud.demo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO=employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		
		
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void saveOrUpdates(Employee employee) {
		employeeDAO.saveOrUpdates(employee);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		employeeDAO.delete(id);
		
	}

}
