package com.sun.spring.methodreplacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("methodreplacement/config.xml");
		MyValueCalculator mv =context.getBean("myValueCalculator",MyValueCalculator.class);
		System.out.println(mv.computeValue("Hi"));
	}

}
