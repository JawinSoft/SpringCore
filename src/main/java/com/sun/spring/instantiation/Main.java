package com.sun.spring.instantiation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		// Java Code 
		StatiFactoryDemo ms = StatiFactoryDemo.createStatiFactoryDemo();
		System.out.println(ms);
		
		ms = StatiFactoryDemo.createStatiFactoryDemo();
		System.out.println(ms);		
		
		//Java Reflection
		/*Constructor<StatiFactoryDemo> constructor= (Constructor<StatiFactoryDemo>) StatiFactoryDemo.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true); 
		StatiFactoryDemo obj = constructor.newInstance(); 
 		System.out.println(obj);*/
		
		// Spring Way of Doing
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation/static-factory-config.xml");
		StatiFactoryDemo obj = context.getBean("statiFactoryDemo",StatiFactoryDemo.class);
 		System.out.println(obj);
	}

}
