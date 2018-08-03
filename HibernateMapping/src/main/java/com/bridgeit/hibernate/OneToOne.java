package com.bridgeit.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bridgeit.Util.HibernateUtil;
import com.bridgeit.model.Car;
import com.bridgeit.model.Engine;

public class OneToOne {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
	    
		Car car=new Car();
		car.setName("Cadillac ATS Sedan");
		Engine engine = new Engine();
		engine.setModel("DTS");
		car.setEngine(engine);
		engine.setCar(car);
		
		session.save(car);
		session.save(engine);
		
		transaction.commit();  
	    session.close();  
	    System.out.println("success");  

	}
}
