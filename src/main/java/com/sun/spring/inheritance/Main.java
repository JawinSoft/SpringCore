package com.sun.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance/config.xml");
		AbhiShek abhi = (AbhiShek) context.getBean("child");
		System.out.println(abhi.getProfession());
		System.out.println(abhi.getAssests());
		System.out.println(abhi.getName());
	}

}
