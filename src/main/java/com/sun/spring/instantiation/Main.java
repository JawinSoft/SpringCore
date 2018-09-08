package com.sun.spring.instantiation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		// Java Code 
		/*MySingleton ms = MySingleton.createMySingleton();
		System.out.println(ms);
		
		ms = MySingleton.createMySingleton();
		System.out.println(ms);*/		
		
		//Java Reflection
		/*Constructor<MySingleton> constructor= (Constructor<MySingleton>) MySingleton.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true); 
		MySingleton obj = constructor.newInstance(); 
 		System.out.println(obj);*/
		
		// Spring Way of Doing
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation/static-factory-config.xml");
		MySingleton obj = context.getBean("mySingleton",MySingleton.class);
 		System.out.println(obj);
	}

}
