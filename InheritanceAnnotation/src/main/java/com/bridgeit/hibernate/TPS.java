package com.bridgeit.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bridgeit.Util.HibernateUtil;
import com.bridgeit.model.C_Employee2;
import com.bridgeit.model.Employee2;
import com.bridgeit.model.R_Employee2;

public class TPS {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
	    
		 	Employee2 e1=new Employee2();  
		    e1.setName("Sam");  
		      
		    R_Employee2 e2=new R_Employee2();  
		    e2.setName("Joshua");  
		    e2.setSalary(15000);  
		    e2.setBonus(7);  
		      
		    C_Employee2 e3=new C_Employee2();  
		    e3.setName("Peter");  
		    e3.setPay_per_hour(1500);  
		    e3.setContract_duration("18 hours");  
		      
		    session.persist(e1);  
		    session.persist(e2);  
		    session.persist(e3);  
		      
		    transaction.commit();  
		    session.close();  
		    System.out.println("success");
	}
}
