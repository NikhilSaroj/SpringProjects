package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection obj = (JavaCollection) context.getBean("collections");
		BeanReference tmp = (BeanReference) context.getBean("refbean");
		
		tmp.getAddressList();
		obj.getBeanReferenceObj();  // getting reference bean values 
		obj.getAddressSet();
		obj.getAddressMap();
		obj.getAddressProps();

	}

}
