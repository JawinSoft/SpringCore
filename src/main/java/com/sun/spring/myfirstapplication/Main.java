package com.sun.spring.myfirstapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//XML Based Configuration
		//ApplicationContext context = new ClassPathXmlApplicationContext("myfirstapplication/xml-config.xml");
		
		//Annotation Based Configuration
		//ApplicationContext context = new ClassPathXmlApplicationContext("myfirstapplication/annotation-config.xml");
		
		//Java Config
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		HelloWorld hw =(HelloWorld) context.getBean("helloWorld");
		System.out.println(hw.getMessage());
	}

}
