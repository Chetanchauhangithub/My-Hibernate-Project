package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Users.class)
								 .buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			// create object of entity class
			
			Users user = new Users("Chetan","123","Chetan","Chauhan");
			// start transaction
			session.beginTransaction();
			// perform operation
			session.save(user);
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Successfully saved");
			
			
		} finally {
			
			session.close();
			factory.close();
			
		}
		
		
		
		
		
	}
	
}
