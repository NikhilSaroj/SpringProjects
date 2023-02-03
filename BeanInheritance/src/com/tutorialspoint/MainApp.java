package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloBean.xml");
		System.out.println("Main");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		obj.getMessage1();
		obj.getMessage2();

		HelloIndia objInd = (HelloIndia) context.getBean("helloindia");
		objInd.getMessage1();
		objInd.getMessage2();
		objInd.getMessage3();
		
	}

}
