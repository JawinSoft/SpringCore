package com.sun.spring.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("circular/circular-dependancy-config.xml");
         ServiceProvider sp = context.getBean("serviceProvider",ServiceProvider.class);
         System.out.println("Service Provider : "+sp);
         System.out.println(" \n Payment Processer associated  with Service Provider "+sp.getPp());
	}

}
