package com.tutorialspoint;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate obj = (StudentJDBCTemplate) ctx.getBean("studentJDBCTemplate");
		
		System.out.println("------Records Creation--------" );
		obj.create("Nikhil", 1);
		obj.create("Suraj", 2);
		obj.create("Shubham", 3);
		
		System.out.println("------Listing Multiple Records--------" );
		List<Student> students = obj.listStudents();
		
	      for (Student record : students) {
	          System.out.print("ID : " + record.getID() );
	          System.out.print(", Name : " + record.getName() );
	          System.out.println(", Age : " + record.getAge());
	       }		
	      
	      System.out.println("----Updating Record with ID = 2 -----" );
	      obj.update(1, 24);
	      
	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student student = obj.getStudent(2);
	      
	      System.out.print("ID : " + student.getID() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());	
	      
	      System.out.println("----Deleting Record with ID = 2 -----" );
	      obj.delete(3);
	      
	}

}
