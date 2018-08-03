package com.bridgeit.hibernate;

public class App {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		dao.addEmployee("Paul", "Fernandes", 10000);
		dao.addEmployee("Frank", "Martin", 20000);
	}

}
