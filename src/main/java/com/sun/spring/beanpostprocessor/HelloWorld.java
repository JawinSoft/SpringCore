package com.sun.spring.beanpostprocessor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean {

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
	
	@PostConstruct
	public void postConstructInit() throws Exception {
		System.out.println("Executing @PostConstruct init() method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing afterPropertiesSet init() method");
	}
	
	public void init() throws Exception {
		System.out.println("Executing configureinit() method");
	}
	
}
