package com.sun.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		//Xml Config 
		//ApplicationContext context = xmlConfig();
		
		//Annotation Config
		ApplicationContext context = annotationConfig();
		
		//javaConfig
		//ApplicationContext context = javaConfig();
		
		Company company1 = context.getBean("company",Company.class);
		System.out.println(company1);		
		Company company2 = context.getBean("company",Company.class);
		System.out.println(company2);
	}
	
	/**
	 * Legacy XML Config Case 1
	 * */
	private static ApplicationContext xmlConfig(){
		return new ClassPathXmlApplicationContext("scope/singleton-config.xml");
		
	}
	
	/**
	 * Spring 2.5 Annotation Config  
	 */
	private static ApplicationContext annotationConfig(){
		return new ClassPathXmlApplicationContext("scope/singleton-config.xml");
	}
	
	/**
	 * Spring 3.0 or higher version Annotation Config  
	 */
	private static ApplicationContext javaConfig(){
		return new AnnotationConfigApplicationContext(JavaConfig.class);
	}
}
