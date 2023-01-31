package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld obj = ctx.getBean(HelloWorld.class);
		
		obj.setMessage("Hello Nikhil");
		obj.getMessage();
	}

}
