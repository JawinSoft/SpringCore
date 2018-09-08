package com.sun.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomScopeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope/custom-config.xml");
		Company company1 = context.getBean(Company.class);
		Company company2 = context.getBean(Company.class);
		System.out.println(company1+" \n "+company2);
		
		Thread th = new Thread(new Runnable(){
			@Override
			public void run() {
				Company company1 = context.getBean(Company.class);
				Company company2 = context.getBean(Company.class);
				System.out.println(company1+" \n "+company2);
				
			}
		});
		th.start();
	}
}
