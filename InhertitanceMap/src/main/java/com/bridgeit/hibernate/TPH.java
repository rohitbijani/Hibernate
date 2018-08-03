package com.bridgeit.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bridgeit.Util.HibernateUtil;
import com.bridgeit.model.Contract_Employee;
import com.bridgeit.model.Employee;
import com.bridgeit.model.Regular_Employee;

public class TPH {
	
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		 	Employee e1=new Employee();  
		    e1.setName("Rohit");  
		      
		    Regular_Employee e2=new Regular_Employee();  
		    e2.setName("Sunil Chhetri");  
		    e2.setSalary(500000);  
		    e2.setBonus(10);  
		      
		    Contract_Employee e3=new Contract_Employee();  
		    e3.setName("Harry Potter");  
		    e3.setPay_per_hour(1000);  
		    e3.setContract_duration("15 hours");  
		      
		    session.persist(e1);  
		    session.persist(e2);  
		    session.persist(e3);  
		      
		    transaction.commit();  
		    session.close();  
		    System.out.println("success");  

	}

}
