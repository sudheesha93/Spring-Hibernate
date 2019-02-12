package com.luv2code.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
					// create 3 student object
					System.out.println("creating a  new student object");
					
					Student tempStudent1=new Student("charan1", "besta1", "sricharanbesta111@gmail.com");
					Student tempStudent2=new Student("charan2", "besta22", "sricharanbesta22@gmail.com");
					Student tempStudent3=new Student("charan3", "besta333", "sricharanbesta3@gmail.com");
					
					// start a transaction
					session.beginTransaction();
					
					//save the student object
					System.out.println("saving the student");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
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
