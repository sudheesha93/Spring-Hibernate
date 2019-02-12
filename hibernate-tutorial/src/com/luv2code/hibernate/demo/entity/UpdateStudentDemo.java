package com.luv2code.hibernate.demo.entity;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateStudentDemo {

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
			
			int StudentId=1;
	
			//read the student details by using hibernate
		session=factory.getCurrentSession();
	session.beginTransaction();
			
			System.out.println("GETTING STUDENT DETAILS WITH ID: "+ StudentId);
			
			Student mystudent=session.get(Student.class, StudentId);
			
			System.out.println("UPDATINGG DETAILS: ");
			mystudent.setFirstName("SharathChandra");
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("DONE...!!!");
			
			// NEW CODEEE
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//update mail for students
			System.out.println("UPDATING EMAIL");
			session.createQuery("update from Student set firstName='charan' where id='5'").executeUpdate();
			
			session.getTransaction().commit();
		}
		finally 
		{
			factory.close();
		}
		
		
	}

}
