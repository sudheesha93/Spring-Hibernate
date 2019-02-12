package com.luv2code.hibernate.demo.entity;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadStudentDemo {

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
			Student tempStudent=new Student("sandeep", "reddy", "sandeepreddy@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("saving the student");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			// MY NEW CODE FOR READ STUDENT
			//retreive the object from the database by finding the primary key
			System.out.println("saved student ID: " + tempStudent.getId());
			
			//read the student details by using hibernate
			System.out.println("aaaaaa");
			session=factory.getCurrentSession();
			System.out.println("nnnnn");
			session.beginTransaction();
			System.out.println("ddddd");
			
			System.out.println("GETTING STUDENT DETAILS WITH ID: "+ tempStudent.getId());
			
			Student mystudent=session.get(Student.class, tempStudent.getId());
			
			System.out.println("COMPLETE DETAILS: "+ mystudent);
			
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
