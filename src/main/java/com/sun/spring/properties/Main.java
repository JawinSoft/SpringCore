package com.sun.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/properties/properties-config.xml");
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
				
		JavaConfig jc = context.getBean(JavaConfig.class);
		System.out.println(jc.getAuthorName());
		
	}

}
