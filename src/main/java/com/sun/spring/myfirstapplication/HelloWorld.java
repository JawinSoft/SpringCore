package com.sun.spring.myfirstapplication;

import org.springframework.stereotype.Component;

@Component
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
