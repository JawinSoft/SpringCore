package com.sun.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context  = 
			//new ClassPathXmlApplicationContext("lifecycle/init-dispos-config.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		context.getBean(LifeCycleByInterface.class);
		
		context.close();
		
	}

	
}
