package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject seession factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// get current hiberanate session
		Session currentSession= sessionFactory.getCurrentSession();
		
		//create a query....sorted by last name
		Query<Customer> theQuery= 
				currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		// execute and get the customer list
		List<Customer> customers=theQuery.getResultList();
		
		//return the results
		return customers;
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// get current hiberanate session
				Session currentSession= sessionFactory.getCurrentSession();
				
		// save/update customer
				currentSession.saveOrUpdate(theCustomer);		
	}

	@Override
	public Customer getCustomer(int theId) {
		
		// get current hiberanate session
		Session currentSession= sessionFactory.getCurrentSession();
		// now retrirveing the customer details from dtabase
		Customer theCustomer=currentSession.get(Customer.class, theId);
		
		//return the customer
		return theCustomer;
		
		
	}

	@Override
	public void deleteCustomer(int theId) {
		
		// get current hiberanate session
				Session currentSession= sessionFactory.getCurrentSession();
				
		// delete the object with primary key
			Query theQuery=	currentSession.createQuery("delete from Customer where id=:customerId");
			theQuery.setParameter("customerId", theId);
			theQuery.executeUpdate();
	
	}

}
