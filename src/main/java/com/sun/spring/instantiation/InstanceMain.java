package com.sun.spring.instantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation/instance-factory-config.xml");
		MySingleton obj = context.getBean("mySingleton",MySingleton.class);
 		System.out.println(obj);
 		
 		MyInstanceClass mis = context.getBean("myInstance",MyInstanceClass.class);
 		System.out.println(mis);
	}
}
