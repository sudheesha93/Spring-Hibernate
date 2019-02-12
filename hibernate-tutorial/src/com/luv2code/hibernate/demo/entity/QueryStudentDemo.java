package com.luv2code.hibernate.demo.entity;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class QueryStudentDemo {

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
			Student tempStudent=new Student("charan34", "besta41", "sric435haranbesta@gmail.com");
			
			// start a transaction and save the student object
			session.beginTransaction();
			session.save(tempStudent);
			
			// query student
			List<Student> thestudents=session.createQuery("from Student").list();
			
			// display the students
			for(Student tempstudent: thestudents) {
				System.out.println(tempstudent);
			}
			
			// query student
			List<Student> thestudents1=session.createQuery("from Student s where s.lastName='reddy' and s.firstName='charan'").list();
						
			// display the students
			for(Student tempstudent: thestudents1) {
				System.out.println(tempstudent);
						}
			
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
