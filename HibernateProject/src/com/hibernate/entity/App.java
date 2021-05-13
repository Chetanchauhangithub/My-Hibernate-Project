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
			
			// 1. Create object of entity class
			
			//Users user = new Users("Arpan","12345","Arpan","Gothi"); for insert
			Users user = new Users(); // for retrieve
			
			// 2. start transaction
			session.beginTransaction();
			
			// 3. Perform Operation
			
			//session.save(user);				--- Insert Data
			user = session.get(Users.class, 2);  // For retrieve
			
			// 4. Commit the Transaction
			session.getTransaction().commit();
			//System.out.println("Successfully saved");
			System.out.println(user);
			
		} finally {
			
			session.close();
			factory.close();
			
		}		
			}
	
}
