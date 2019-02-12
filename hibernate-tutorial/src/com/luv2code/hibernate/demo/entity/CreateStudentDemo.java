package com.luv2code.hibernate.demo.entity;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
	// create sessionfactory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	//create session
		Session session=factory.getCurrentSession();
	
		try
		{
			//use the session object to save the java object
			// create a student object
			System.out.println("creating a  new student object");
			Student tempStudent=new Student("sandeepj", "reddyjb", "sasas222a@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("saving the student");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("DONE...!!!");
			
		}
		finally 
		{
			factory.close();
		}
		
		
	}

}
