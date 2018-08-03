package com.bridgeit.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bridgeit.Util.HibernateUtil;
import com.bridgeit.model.Bar;
import com.bridgeit.model.Foo;

public class OneToMany {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
	    
		Foo foo1=new Foo();
		Bar bar1=new Bar();
		Bar bar2=new Bar();
		List<Bar> list=new ArrayList<Bar>();
		foo1.setName("foo1");
		bar1.setName("bar1");
		bar2.setName("bar2");
		list.add(bar1);
		list.add(bar2);
		foo1.setBar(list);

		session.save(foo1);
		session.save(bar1);
		session.save(bar2);
		
		transaction.commit();  
	    session.close();  
	    System.out.println("success");  

	}
}
