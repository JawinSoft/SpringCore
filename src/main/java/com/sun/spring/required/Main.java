package com.sun.spring.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		BankAccount ba = context.getBean(BankAccount.class);
		System.out.println(ba);
	}
}
