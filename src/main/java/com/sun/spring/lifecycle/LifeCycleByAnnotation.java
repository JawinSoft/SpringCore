package com.sun.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleByAnnotation {
 
	public LifeCycleByAnnotation() {
		System.out.println("LifeCycleBeanImpl Constructor Execution");
	}
	
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Executing init method");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Executing destroy method");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Executing finalize method");
	}
}
