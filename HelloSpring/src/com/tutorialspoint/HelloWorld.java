package com.tutorialspoint;

public class HelloWorld {
	 private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   
	   public void init() {
		   System.out.println("Initialiazation before bean is created");
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void destroy() {
		   System.out.println("Destruction before bean destructs");
	   }
}
