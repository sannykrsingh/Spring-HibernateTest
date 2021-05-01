package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDemo {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		SessionFactory factory=cfg.configure().addAnnotatedClass(Student.class).buildSessionFactory();
				
		Student st= new Student(102,"Rakesh", "kumar", "rakesh@gmail.com");
		Session session= factory.openSession();
		session.save(st);
		Transaction tx=session.beginTransaction();
		tx.commit();
		
	}
}
