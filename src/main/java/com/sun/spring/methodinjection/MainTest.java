package com.sun.spring.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigMI.class);
		MovieTicketBook mvb = context.getBean("movieTicketBook",MovieTicketBook.class);
		
		
		System.out.println(mvb.getSeat());
		System.out.println(mvb.getSeat());
		System.out.println(mvb.getSeat());
		System.out.println(mvb.getSeat());
		System.out.println(mvb.getSeat());
		System.out.println(mvb.getSeat());
		
		
	}

}
