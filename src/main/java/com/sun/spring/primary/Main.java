package com.sun.spring.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		JobPrefer jp = context.getBean("jobPrefer",JobPrefer.class);
		System.out.println(jp.getJob().jobSafety());
	}
}
