package com.bridgeit.hibernate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EmployeeDao dao=new EmployeeDao();
		dao.addEmployee("Pablo", "Escobar", 250000);
		dao.addEmployee("Tony", "Stark", 150000);
        System.out.println(dao.getEmployeeList());
//        dao.getEmployeeList();
//        dao.updateEmployee(3, 459999);
//        dao.deleteEmployee(4);
        
        
    }
}
