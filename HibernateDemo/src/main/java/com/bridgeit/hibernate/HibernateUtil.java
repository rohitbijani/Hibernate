package com.bridgeit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.Employee;


public class HibernateUtil {   
		
	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().addClass(Employee.class).configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
