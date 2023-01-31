package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable    /* Using this will indicate that class 
                    can be used by spring IoC container 
                    as a source of bean definition */
public class HelloWorldConfig {
	
	@Bean        /* Indicates that a method will return an object that
	                should be registered as a bean definition */
	   public HelloWorld helloWorld(){
		      return new HelloWorld();
		   }
}
