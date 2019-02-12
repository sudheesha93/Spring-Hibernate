package com.luv2code.springboot.crud.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.crud.demo.entity.Employee;

@Repository
public class EmployeeDAoHibernateImpl implements EmployeeDAO {
	
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAoHibernateImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}
	
	
	@Override
	
	public List<Employee> findAll(){
		
		Session currentSession= entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery=
				currentSession.createQuery("from Employee", Employee.class);
		
		List<Employee> employees=theQuery.getResultList();
		
		return employees;
	}


	@Override
	
	public Employee findById(int id) {
		
		Session currentSession= entityManager.unwrap(Session.class);
		
		Employee employee= currentSession.get(Employee.class, id);
		
		return employee;
	}


	@Override
	
	public void delete(int id) {
		Session currentSession= entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery=
				currentSession.createQuery("delete from Employee where id=:empId");
		theQuery.setParameter("empId", id);
		
		

	}


	@Override
	public void saveOrUpdates(Employee employee) {
		Session currentSession= entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee); 
		
	}

}
