package com.sun.spring.required.jsr330;

import javax.inject.Named;


@Named
public class HelloWorld {

	private String message = "Hello My Dear Friends.. Welcome to Spring.";
	
	public HelloWorld() {
	 	System.out.println("HelloWorld Instantiation . Exectuing Zero Arg Constructor ..!");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
