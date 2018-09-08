package com.sun.spring.cnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cnamespace/config.xml");
		Foo foo = context.getBean(Foo.class);
		System.out.println(foo.getBar());
		System.out.println(foo.getBaz());
		System.out.println(foo.getEmail());
	}

}
