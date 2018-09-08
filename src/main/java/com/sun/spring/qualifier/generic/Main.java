package com.sun.spring.qualifier.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		A a = context.getBean("a",A.class);
		System.out.println(a.getStringArg().getToString("Hi Dear. WelCome to Spring Qualifier Generics"));
		
		
		B b = context.getBean("b",B.class);
		System.out.println(b.getIntGeneric().getToString(100));
	}

}
