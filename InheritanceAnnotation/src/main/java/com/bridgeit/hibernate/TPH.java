package com.bridgeit.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bridgeit.Util.HibernateUtil;
import com.bridgeit.model.C_Employee1;
import com.bridgeit.model.Employee1;
import com.bridgeit.model.R_Employee1;

public class TPH {
	
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		 	Employee1 e1=new Employee1();  
		    e1.setName("Rohit");  
		      
		    R_Employee1 e2=new R_Employee1();  
		    e2.setName("Sunil Chhetri");  
		    e2.setSalary(500000);  
		    e2.setBonus(10);  
		      
		    C_Employee1 e3=new C_Employee1();  
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
