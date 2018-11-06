package com.sun.spring.required.jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		HelloWorld hw = context.getBean("helloWorld",HelloWorld.class);
		System.out.println(hw.getMessage());
	}

}
