package com.sun.spring.beanfactorypostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.spring.myfirstapplication.HelloWorld;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factorypostprocessor/config.xml");
		HelloWorld hw1 = context.getBean("helloWorld",HelloWorld.class);
		HelloWorld hw2 = context.getBean("helloWorld",HelloWorld.class);
		
		System.out.println(hw1);
		System.out.println(hw2);

		System.out.println(hw1.getMessage());
	}

}
