package com.bridgeit.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bridgeit.model.Employee;

public class EmployeeDao {
	
	public List<Employee> getEmployeeList() {
		List<Employee> empList = null;
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			empList=(List<Employee>) session.createQuery("from Employee");
			for (Iterator iterator = empList.iterator(); iterator.hasNext();){
		            Employee employee = (Employee) iterator.next(); 
		            System.out.print("First Name: " + employee.getFirstName()); 
		            System.out.print("  Last Name: " + employee.getLastName()); 
		            System.out.println("  Salary: " + employee.getSalary()); 
		         }
			 transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();			
		} finally {
			session.close();
		}
		return empList;
		
	}
	
	public void addEmployee(String fname, String lname, int salary) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			Employee employee = new Employee();
	         employee.setFirstName(fname);
	         employee.setLastName(lname);
	         employee.setSalary(salary);
			session.save(employee);
			System.out.println("Inserted Employee.. ID: "+employee.getId());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteEmployee(Integer id) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			Employee employee=session.get(Employee.class, id);
			session.delete(employee);
			System.out.println("Deleted Employee.. ID: "+employee.getId());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		} finally {
			session.close();
		}		
	}
	
	public void updateEmployee(Integer EmployeeID, int salary) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			Employee employee=session.get(Employee.class, EmployeeID);
			employee.setSalary(salary);
			session.update(employee);
			System.out.println("Updated Employee");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		} finally {
			session.close();
		}
	}
	

}
