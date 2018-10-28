package com.sun.spring.beanpostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
	}

}
