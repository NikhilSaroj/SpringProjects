package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		
		ctx.start();   // calling startEventHandler
		
		HelloWorld obj = (HelloWorld) ctx.getBean("helloWorld");
		obj.getMessage();
		 
		ctx.stop();  // calling stopEventHandler
	}
}
