package com.sun.spring.exnull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependency-all-mix/config.xml");
		ExampleBean eb = context.getBean(ExampleBean.class);
		System.out.println(eb);
		System.out.println(" - "+eb.getEmail()+" - ");
	}

}
